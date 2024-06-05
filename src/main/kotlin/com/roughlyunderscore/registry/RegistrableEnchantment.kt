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
import com.roughlyunderscore.data.*
import com.roughlyunderscore.debug.Describable
import com.roughlyunderscore.ulib.data.Time
import org.bukkit.Keyed
import org.bukkit.Material
import org.jetbrains.annotations.Range

/**
 * This interface represents UnderscoreEnchants' registrable enchantments.
 *
 * At no point should you implement this interface, as it is only used internally by
 * UnderscoreEnchants to register enchantments that are available to the API.
 */
@Since("2.2")
interface RegistrableEnchantment : Registrable, Keyed, Describable<RegistrableEnchantment> {
  /**
   * The author of the enchantment.
   */
  @Since("2.2")
  val author: String

  /**
   * The description of the enchantment.
   */
  @Since("2.2")
  val description: List<String>

  /**
   * The enchantment's activation chance.
   */
  @Since("2.2")
  val activationChance: Double

  /**
   * The enchantment's cooldown in ticks.
   */
  @Since("2.2")
  val cooldown: Time

  /**
   * The enchantment's trigger.
   */
  @Since("2.2")
  val trigger: RegistrableTrigger

  /**
   * The enchantment's activation indicator.
   */
  @Since("2.2")
  val activationIndicator: RegistrableActivationIndicator

  /**
   * The enchantment's applicables.
   */
  @Since("2.2")
  val applicables: List<RegistrableApplicable>

  /**
   * The enchantment's forbidden materials. Note that while it cannot legally be applied to any of
   * these materials (e.g., via an enchanting table), it can still be applied to these materials
   * via the API or commands.
   *
   * The list might be empty.
   */
  @Since("2.2")
  val forbiddenMaterials: List<Material>

  /**
   * The enchantment's conditions.
   */
  @Since("2.2")
  val conditions: List<EnchantmentCondition>

  /**
   * The enchantment's conflicts. Note that this list contains the NamespacedKey's keys of those enchantments
   * with which this enchantment conflicts (e.g., "frost_walker" for "minecraft:frost_walker").
   * Additionally, The enchantment can still be applied to the same item as any of these
   * enchantments via the API.
   */
  @Since("2.2")
  val conflicts: List<String>

  /**
   * The enchantment's levels.
   */
  @Since("2.2")
  val levels: List<EnchantmentLevel>

  /**
   * The enchantment's obtainment restrictions.
   */
  @Since("2.2")
  val obtainmentRestrictions: List<EnchantmentObtainmentRestriction>

  /**
   * The enchantment seekers that this enchantment uses.
   */
  @Since("2.2")
  val enchantmentSeekers: List<RegistrableEnchantmentSeeker>

  /**
   * Whether the enchantment is unique. Unique enchantments are those
   * that can be the only enchantment applied to an item.
   */
  @Since("2.2")
  val unique: Boolean

  /**
   * All enchantments required to be present on the player in some way.
   */
  @Since("2.2")
  val requiredEnchantments: List<RequiredEnchantment>

  /**
   * All worlds that are blacklisted for this enchantment.
   */
  @Since("2.2")
  val worldBlacklist: List<String>

  /**
   * All worlds that are whitelisted for this enchantment.
   */
  @Since("2.2")
  val worldWhitelist: List<String>

  /**
   * All plugins that are required for this enchantment to load.
   */
  @Since("2.2")
  val requiredPlugins: List<RequiredPlugin>
}