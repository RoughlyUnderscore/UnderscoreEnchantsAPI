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
import com.roughlyunderscore.enums.LoadResponse
import com.roughlyunderscore.enums.UnloadResponse
import java.io.File

/**
 * This interface represents UnderscoreEnchants' loader.
 *
 * At no point should you implement this interface, as it is implemented by
 * UnderscoreEnchants.
 */
@Since("2.2")
interface UELoader {
  /**
   * Attempts to load an enchantment from a given [enchantmentName].
   * @return the response to the action
   */
  @Since("2.2")
  fun loadEnchantment(enchantmentName: String): LoadResponse

  /**
   * Attempts to load an enchantment from a given [file].
   * @return the response to the action
   */
  @Since("2.2")
  fun loadEnchantment(file: File): LoadResponse

  /**
   * Attempts to unload an enchantment from a given [enchantmentName].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadEnchantment(enchantmentName: String): UnloadResponse

  /**
   * Attempts to unload an enchantment from a given [file].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadEnchantment(file: File): UnloadResponse

  /**
   * Attempts to load an enchantment pack from a given [packFile].
   * @return the response to the action
   */
  @Since("2.2")
  fun loadPack(packFile: File): LoadResponse

  /**
   * Attempts to unload an enchantment pack from a given [packFile].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadPack(packFile: File): UnloadResponse

  /**
   * Attempts to unload an enchantment pack from a given [packName].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadPack(packName: String): UnloadResponse

  /**
   * Attempts to load a locale from a given [localeFile].
   * @return the response to the action
   */
  @Since("2.2")
  fun loadLocale(localeFile: File): LoadResponse

  /**
   * Attempts to load a locale from a given [localeName].
   * @return the response to the action
   */
  @Since("2.2")
  fun loadLocale(localeName: String): LoadResponse

  /**
   * Attempts to unload a locale from a given [localeFile].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadLocale(localeFile: File): UnloadResponse

  /**
   * Attempts to unload a locale from a given [localeName].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadLocale(localeName: String): UnloadResponse
}