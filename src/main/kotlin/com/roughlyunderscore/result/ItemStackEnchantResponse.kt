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

package com.roughlyunderscore.result

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.enums.ItemStackEnchantResponseType
import org.bukkit.Keyed
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack

/**
 * A wrapper for responses for when an item is requested to be enchanted. A response type
 * is provided explaining the result of the enchantment process, along with the passed enchantment
 * values of requested key and requested level, and the (potentially unmodified) result item.
 */
@Since("2.2")
data class ItemStackEnchantResponse(
  val type: ItemStackEnchantResponseType,
  val enchantmentKey: NamespacedKey,
  val level: Int,
  val resultItem: ItemStack
) : Keyed {
  override fun getKey(): NamespacedKey = enchantmentKey
}