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

package com.roughlyunderscore.api

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.enums.EnchantingRestriction
import com.roughlyunderscore.result.ItemStackEnchantResponse
import org.bukkit.NamespacedKey
import org.bukkit.entity.Player
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.ItemStack

/**
 * This interface represents UnderscoreEnchants' enchanter.
 *
 * At no point should you implement this interface, as it is implemented by
 * UnderscoreEnchants.
 */
@Since("2.2")
interface UEEnchanter {
  /**
   * Gets the namespaced key of an enchantment by its [name].
   * @return the namespaced key of the enchantment, or null if not found
   */
  @Since("2.2")
  fun getUnderscoreEnchantment(name: String): NamespacedKey?

  /**
   * Disenchants an [item] - removes an enchantment, found by a [key]
   * @throws IllegalArgumentException if the enchantment was not found, or if the item doesn't have the given enchantment
   * @return the disenchanted item
   */
  @Since("2.2")
  fun disenchant(item: ItemStack, key: NamespacedKey): ItemStack

  /**
   * Disenchants a [player]'s item - removes an enchantment, found by this namespaced [key], in a given [slot]
   * @throws IllegalArgumentException if the enchantment was not found, or if the item doesn't have the given enchantment
   */
  @Since("2.2")
  fun disenchant(player: Player, slot: EquipmentSlot, key: NamespacedKey)

  /**
   * Fully disenchants an [item]
   * @return the disenchanted item
   */
  @Since("2.2")
  fun fullyDisenchant(item: ItemStack): ItemStack

  /**
   * Fully disenchants a [player]'s item in a given [slot]
   */
  @Since("2.2")
  fun fullyDisenchant(player: Player, slot: EquipmentSlot)

  /**
   * Enchants an [item] with an enchantment, found by this namespaced [key], with a given [level] and a list of [liftedRestrictions]
   * @throws IllegalArgumentException if the enchantment was not found
   * @return the enchanted item wrapped in a response
   */
  @Since("2.2")
  fun enchant(item: ItemStack, key: NamespacedKey, level: Int, liftedRestrictions: List<EnchantingRestriction>): ItemStackEnchantResponse
}