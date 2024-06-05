// Copyright 2024 RoughlyUnderscore
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.roughlyunderscore.data

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.debug.Describable
import com.roughlyunderscore.debug.Describer
import com.roughlyunderscore.enums.EnchantmentObtainmentMeans

/**
 * This class represents the obtainment limitations for an enchantment.
 *
 * At no point should you need to construct this class, as it is only created internally by UnderscoreEnchants to
 * create enchantments.
 */
@Since("2.2")
data class EnchantmentObtainmentRestriction(
  val means: EnchantmentObtainmentMeans,
  val levels: List<Int>
) : Describable<EnchantmentObtainmentRestriction> {
  companion object {
    val describer = object : Describer<EnchantmentObtainmentRestriction> {
      override fun describeShortly(locale: UELocale, obj: EnchantmentObtainmentRestriction?): String? {
        if (obj == null) return null

        val name = obj.means.name
        val levels = obj.levels.joinToString(", ")

        return "$name ($levels)"
      }

      override fun describe(locale: UELocale, obj: EnchantmentObtainmentRestriction?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }

    /**
     * Creates an [EnchantmentObtainmentRestriction] from a [levelsString] with the given [means].
     */
    @Since("2.2")
    fun of(means: EnchantmentObtainmentMeans, levelsString: String): EnchantmentObtainmentRestriction {
      // When separated by a dash (e.g., 1-5) collect everything inclusively
      // When separated by a comma, (e.g., 1,3) collect only those 2 numbers
      // When both are present (e.g., 1-6,8 or 1,3-5) collect accordingly
      val levels = mutableListOf<Int>()
      val parts = levelsString.replace(" ", "").split(",")
      for (part in parts) {
        if (part.contains("-")) {
          val range = part.split("-")
          for (i in range[0].toInt()..range[1].toInt()) levels.add(i)
        } else {
          levels.add(part.toInt())
        }
      }

      return EnchantmentObtainmentRestriction(means, levels)
    }
  }

  override fun getDescriber(): Describer<EnchantmentObtainmentRestriction> = describer
}