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
import com.roughlyunderscore.registry.RegistrableAction
import com.roughlyunderscore.ulib.data.Time

/**
 * This class represents an enchantment action, which includes a [RegistrableAction],
 * a chance of execution, a delay before execution and the arguments for this action.
 *
 * At no point should you need to construct this class, as it is only created internally by UnderscoreEnchants to
 * create enchantments.
 */
@Since("2.2")
data class EnchantmentAction(
  val action: RegistrableAction,
  val chance: Double,
  val delay: Time,
  val target: TargetType,
  val arguments: List<String>,
  val conditions: List<EnchantmentCondition>
): Describable<EnchantmentAction> {
  init {
    require (chance in 0.0..100.0) { "Chance must be between 0.0 and 100.0" }
    require (delay.ticks >= 0) { "Delay must be greater than or equal to 0" }
  }

  companion object {
    val describer = object: Describer<EnchantmentAction> {
      override fun describeShortly(locale: UELocale, obj: EnchantmentAction?): String? {
        if (obj == null) return null

        val name = obj.action.aliases.firstOrNull() ?: return null
        val args =
          if (obj.arguments.isEmpty()) ""
          else " (${obj.arguments.joinToString(" ")})"
        val conditions =
          if (obj.conditions.isEmpty()) ""
          else " (${obj.conditions.joinToString(" ") { it.getDescriber().describeShortly(locale, it)!! }})"
        val target = obj.target.name
        val chance = obj.chance

        return "$name$args$conditions ($target, $chance)"
      }

      override fun describe(locale: UELocale, obj: EnchantmentAction?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<EnchantmentAction> = describer
}