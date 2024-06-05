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

package com.roughlyunderscore.registry

import com.roughlyunderscore.annotations.Since
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

/**
 * This interface is used to create enchantment seekers.
 */
@Since("2.2")
interface RegistrableEnchantmentSeeker : Registrable {
  /**
   * By default, the plugin does not know where to look for the enchanted item. An enchantment seeker
   * is needed. The enchantment seeker can be as simple as returning the main hand and as complicated
   * as returning the item in the [player]'s inventory with the highest level of a certain enchantment.
   * The general idea behind an enchantment seeker, however, is to just return items from constant
   * slots, such as the main hand or all armor pieces. The plugin then checks for the enchantments
   * on the items returned by the enchantment seeker and selects the highest found level.
   */
  @Since("2.2")
  fun seekItems(player: Player): List<ItemStack?>
}