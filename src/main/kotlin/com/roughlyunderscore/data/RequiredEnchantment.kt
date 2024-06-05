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
import com.roughlyunderscore.registry.RegistrableEnchantmentSeeker
import org.bukkit.Keyed
import org.bukkit.NamespacedKey

/**
 * This object represents an enchantment being required as a part of
 * another enchantment. For example, an enchantment might require the player
 * to have Fire Aspect of any level on the same item, or Sharpness from II to V
 * on the offhand item.
 */
@Since("2.2")
data class RequiredEnchantment(
  val enchantmentKey: NamespacedKey,

  /**
   * Returns all seekers for this enchantment. Out of all of them,
   * at least one of them must find the enchantment. If the list
   * is empty, the enchantment is assumed to be sought on the same
   * item that has activated the enchantment - however, since there
   * is no clear way to determine exactly what item activated the enchantment
   * (the initial seeker might find multiple matching items during
   * the activation detection process), this is discouraged.
   */
  val seekers: List<RegistrableEnchantmentSeeker>,

  /**
   * Returns all levels that are accepted. If the list is empty,
   * it is assumed that any level is accepted.
   */
  val levels: List<Int>
) : Keyed, Describable<RequiredEnchantment> {
  companion object {
    val describer = object : Describer<RequiredEnchantment> {
      override fun describeShortly(locale: UELocale, obj: RequiredEnchantment?): String? {
        if (obj == null) return null

        val key = obj.enchantmentKey.key
        val seekerAliases = obj.seekers.joinToString(", ") { it.getAliases().first() }
        val levels = obj.levels.joinToString(", ")

        return "$key (${locale.logTokenRegistrySeekerPlural}: $seekerAliases) (${locale.tokenEnchantmentLevels}: $levels)"
      }

      override fun describe(locale: UELocale, obj: RequiredEnchantment?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<RequiredEnchantment> = describer
  override fun getKey(): NamespacedKey = enchantmentKey
}