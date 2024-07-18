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
import com.roughlyunderscore.data.EnchantmentPack
import org.bukkit.NamespacedKey
import org.bukkit.plugin.java.JavaPlugin

/**
 * This is the registry class. This class is used to register triggers, placeholders,
 * and many other things. It is also used to retrieve them.
 *
 * Note that this class should only ever be implemented by UnderscoreEnchants.
 * @see Registrable
 */
@Since("2.2")
interface UEAPIRegistry {
  /**
   * Provides a [RegistrablesProvider] to the API to register new items.
   *
   * Please use this method sparingly, as a call to [provide] causes some
   * enchantments to be reloaded. Instead of calling [provide] multiple times,
   * return a single [RegistrablesProvider] with a list of all the registrables
   * you wish to provide.
   * @param provider the provider
   */
  @Since("2.2")
  fun provide(provider: RegistrablesProvider)

  /**
   * Refreshes a registry. This clears all loaded registrables, except for enchantments,
   * then loads them again from enabled providers.
   * @see RegistrablesProvider
   */
  @Since("2.2")
  fun refresh()

  /**
   * This method finds an action by its [name] (alias).
   * @return the action, or null if not found
   */
  @Since("2.2")
  fun findAction(name: String): RegistrableAction?

  /**
   * This method finds an applicable by its [name] (alias).
   * @return the applicable, or null if not found
   */
  @Since("2.2")
  fun findApplicable(name: String): RegistrableApplicable?

  /**
   * This method finds a condition by its [name] (alias).
   * @return the condition, or null if not found
   */
  @Since("2.2")
  fun findCondition(name: String): RegistrableCondition?

  /**
   * This method finds an enchantment by its [name] (alias).
   * @return the enchantment, or null if not found
   */
  @Since("2.2")
  fun findEnchantment(name: String): RegistrableEnchantment?

  /**
   * This method finds an enchantment pack by its [name]. While an enchantment pack
   * is not a registrable object, it is a container for registrable enchantments,
   * and as such is stored inside the registry for convenience.
   * @return the enchantment pack, or null if not found
   */
  @Since("2.2")
  fun findEnchantmentPack(name: String): EnchantmentPack?

  /**
   * This method finds an activation indicator by its [name] (alias).
   * @return the activation indicator, or null if not found
   */
  @Since("2.2")
  fun findIndicator(name: String): RegistrableActivationIndicator?

  /**
   * This method finds a placeholder by its [name] (alias).
   * @return the placeholder, or null if not found
   */
  @Since("2.2")
  fun findPlaceholder(name: String): RegistrablePlaceholder?

  /**
   * This method finds a trigger by its [name] (alias).
   * @return the trigger, or null if not found
   */
  @Since("2.2")
  fun findTrigger(name: String): RegistrableTrigger?

  /**
   * Finds an enchantment by a NamespacedKey.
   * @return the enchantment, or null if not found
   */
  @Since("2.2")
  fun findEnchantmentByKey(key: NamespacedKey): RegistrableEnchantment?

  /**
   * Finds an enchantment by its [keyString] (e.g. "test_enchantment" in "underscore:test_enchantment").
   * Returns null if none is found.
   */
  @Since("2.2")
  fun findEnchantmentByKeyString(keyString: String): RegistrableEnchantment?

  /**
   * This method finds an enchantment seeker by its [name] (alias).
   * @return the seeker, or null if not found
   */
  @Since("2.2")
  fun findSeeker(name: String): RegistrableEnchantmentSeeker?

  /**
   * This method finds all actions by a [plugin] that has registered it.
   * Note that the list may be empty.
   * @return the list of actions
   */
  @Since("2.2")
  fun findActions(plugin: JavaPlugin): List<RegistrableAction>

  /**
   * This method finds all applicables by a [plugin] that has registered it.
   * Note that the list may be empty.
   * @return the list of applicables
   */
  @Since("2.2")
  fun findApplicables(plugin: JavaPlugin): List<RegistrableApplicable>

  /**
   * This method finds all conditions by a [plugin] that has registered it.
   * Note that the list may be empty.
   * @return the list of conditions
   */
  @Since("2.2")
  fun findConditions(plugin: JavaPlugin): List<RegistrableCondition>

  /**
   * This method finds all enchantments by a [plugin] that has registered it.
   * Note that the list may be empty.
   * @return the list of enchantment
   */
  @Since("2.2")
  fun findEnchantments(plugin: JavaPlugin): List<RegistrableEnchantment>

  /**
   * This method finds all activation indicators by [plugin] plugin that has registered it.
   * Note that the list may be empty.
   * @return the list of activation
   */
  @Since("2.2")
  fun findIndicators(plugin: JavaPlugin): List<RegistrableActivationIndicator>

  /**
   * This method finds all placeholders by a [plugin] that has registered it.
   * Note that the list may be empty.
   * @return the list of placeholder
   */
  @Since("2.2")
  fun findPlaceholders(plugin: JavaPlugin): List<RegistrablePlaceholder>

  /**
   * This method finds all triggers by a [plugin] that has registered it.
   * Note that the list may be empty.
   * @return the list of triggers
   */
  @Since("2.2")
  fun findTriggers(plugin: JavaPlugin): List<RegistrableTrigger>

  /**
   * This method finds all enchantment seekers by [plugin] plugin that has registered it.
   * Note that the list may be empty.
   * @return the list of seekers
   */
  @Since("2.2")
  fun findSeekers(plugin: JavaPlugin): List<RegistrableEnchantmentSeeker>

  /**
   * An immutable copy of all registered actions.
   */
  @Since("2.2")
  val registeredActions: List<RegistrableAction>

  /**
   * An immutable copy of all registered activation indicators.
   */
  @Since("2.2")
  val registeredActivationIndicators: List<RegistrableActivationIndicator>

  /**
   * An immutable copy of all registered applicables.
   */
  @Since("2.2")
  val registeredApplicables: List<RegistrableApplicable>

  /**
   * An immutable copy of all registered conditions.
   */
  @Since("2.2")
  val registeredConditions: List<RegistrableCondition>

  /**
   * An immutable copy of all registered enchantments.
   */
  @Since("2.2")
  val registeredEnchantments: List<RegistrableEnchantment>

  /**
   * An immutable copy of all registered enchantment seekers.
   */
  @Since("2.2")
  val registeredEnchantmentSeekers: List<RegistrableEnchantmentSeeker>

  /**
   * An immutable copy of all registered enchantment placeholders.
   */
  @Since("2.2")
  val registeredPlaceholders: List<RegistrablePlaceholder>

  /**
   * An immutable copy of all registered triggers.
   */
  @Since("2.2")
  val registeredTriggers: List<RegistrableTrigger>
}