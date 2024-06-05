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

package com.roughlyunderscore

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.api.UEEnchanter
import com.roughlyunderscore.api.UELoader
import com.roughlyunderscore.api.UEPlayerManager
import com.roughlyunderscore.data.UELocale
import com.roughlyunderscore.registry.UEAPIRegistry

/**
 * This is the central point of the API. It is used to, among other things,
 * retrieve the registry, which is used to register and unregister enchantments,
 * enchantment actions, etc. You should fetch an implementation of this interface
 * from the Bukkit's service system.
 */
@Since("2.2")
interface UEAPI {
  /**
   * Gets the locale by its [localeIdentifier]. This only looks for loaded locales.
   * @return the locale, or null if not found
   */
  @Since("2.2")
  fun getLocale(localeIdentifier: String): UELocale?

  /**
   * Gets the primary server locale.
   */
  @Since("2.2")
  fun getServerLocale(): UELocale

  /**
   * Gets the data registry. Use it to register your placeholders, actions, conditions, etc.
   * This is the **only** way that you should fetch the UnderscoreEnchantsAPI registry.
   */
  @Since("2.2")
  fun getRegistry(): UEAPIRegistry

  /**
   * Gets the enchanter. Use it to enchant items, disenchant items, etc.
   * This is the **only** way that you should fetch the UnderscoreEnchantsAPI enchanter.
   */
  @Since("2.2")
  fun getEnchanter(): UEEnchanter

  /**
   * Gets the loader. Use it to (un)load enchantments, packs, etc.
   * This is the **only** way that you should fetch the UnderscoreEnchantsAPI loader.
   */
  @Since("2.2")
  fun getLoader(): UELoader

  /**
   * Gets the player manager. Use it to toggle enchantments for players, manipulate
   * players' locales, etc.
   * This is the **only** way that you should fetch the UnderscoreEnchantsAPI player manager.
   */
  @Since("2.2")
  fun getPlayerManager(): UEPlayerManager
}