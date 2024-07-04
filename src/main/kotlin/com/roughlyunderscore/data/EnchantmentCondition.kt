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
import com.roughlyunderscore.enums.TargetType
import com.roughlyunderscore.registry.RegistrableCondition

/**
 * This class represents an enchantment condition, which includes a [RegistrableCondition],
 * a negation indicator, the target value and arguments, if any.
 *
 * At no point should you need to construct this class, as it is only created internally by UnderscoreEnchants to
 * create enchantments.
 */
@Since("2.2")
data class EnchantmentCondition(
  val condition: RegistrableCondition,
  val negate: Boolean,
  val target: TargetType,
  val arguments: List<String>
) : Describable<EnchantmentCondition> {
  companion object {
    val describer = object : Describer<EnchantmentCondition> {
      override fun describeShortly(locale: UELocale, obj: EnchantmentCondition?): String? {
        if (obj == null) return null

        val name = obj.condition.aliases.firstOrNull() ?: return null
        val args =
          if (obj.arguments.isEmpty()) ""
          else " ${obj.arguments.joinToString(" ")}"
        val negate =
          if (obj.negate) " (${locale.tokenEnchantmentNegated})"
          else ""
        val target = obj.target.name

        return "$name$args$negate ($target)"
      }

      override fun describe(locale: UELocale, obj: EnchantmentCondition?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<EnchantmentCondition> = describer
}