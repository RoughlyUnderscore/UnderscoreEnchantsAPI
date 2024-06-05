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
import com.roughlyunderscore.ulib.data.Time

/**
 * This class represents an enchantment level.
 *
 * At no point should you need to construct this class, as it is only created internally by UnderscoreEnchants to
 * create enchantments.
 */
@Since("2.2")
data class EnchantmentLevel(
  val level: Int,
  val conditions: List<EnchantmentCondition>,
  val chance: Double,
  val cooldown: Time,
  val actions: List<EnchantmentAction>
) : Describable<EnchantmentLevel> {
  init {
    require(level > 0) { "Level must be greater than 0" }
    require(chance in 0.0..100.0) { "Chance must be between 0.0 and 100.0" }
    require(cooldown.ticks >= 0) { "Cooldown must be greater than or equal to 0" }
  }

  companion object {
    val describer = object : Describer<EnchantmentLevel> {
      override fun describeShortly(locale: UELocale, obj: EnchantmentLevel?): String? {
        if (obj == null) return null

        val level = obj.level
        val actions = obj.actions.joinToString(", ") { "[${it.getDescriber().describeShortly(locale, it)}]" }
        val conditions = obj.conditions.joinToString(", ") { "[${it.getDescriber().describeShortly(locale, it)}]" }
        val chance = obj.chance
        val cooldown = obj.cooldown.ticks

        return "$level; ${locale.tokenEnchantmentActions}: $actions; ${locale.tokenEnchantmentConditions}:" +
          "$conditions; ${locale.tokenEnchantmentChance}: $chance; ${locale.tokenEnchantmentCooldown}: $cooldown"
      }

      override fun describe(locale: UELocale, obj: EnchantmentLevel?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<EnchantmentLevel> = describer
}