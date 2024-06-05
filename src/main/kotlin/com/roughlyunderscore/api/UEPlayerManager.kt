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
import com.roughlyunderscore.data.UELocale
import org.bukkit.NamespacedKey
import java.util.*

/**
 * This interface represents UnderscoreEnchants' player manager.
 *
 * At no point should you implement this interface, as it is implemented by
 * UnderscoreEnchants.
 */
@Since("2.2")
interface UEPlayerManager {
  /**
   * Returns the locale of a player identified by their [uuid].
   * @return the locale of the player, or null if the player either does not exist, or
   * did not set their locale
   */
  @Since("2.2")
  fun getLocale(uuid: UUID): UELocale?

  /**
   * Sets the locale, detected by a [localeIdentifier] of a player identified by their [uuid].
   * If [silent] is true, does not notify the player of the change.
   */
  @Since("2.2")
  fun setLocale(uuid: UUID, localeIdentifier: String, silent: Boolean)

  /**
   * Checks if a player, identified by their [uuid], has an enchantment ([key]) disabled.
   * Please note that only UnderscoreEnchants' enchantments can be disabled.
   * Vanilla enchantments cannot be disabled.
   * @return true if the player has the enchantment disabled, false otherwise
   */
  @Since("2.2")
  fun isDisabled(uuid: UUID, key: NamespacedKey): Boolean

  /**
   * Toggles an enchantment ([key]) for a player, identified by their [uuid].
   * If [silent] is true, does not notify the player of the change.
   * Please note that only UnderscoreEnchants' enchantments can be disabled.
   * Vanilla enchantments cannot be disabled.
   */
  @Since("2.2")
  fun toggle(uuid: UUID, key: NamespacedKey, silent: Boolean)
}