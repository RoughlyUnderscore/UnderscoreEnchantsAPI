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
import com.roughlyunderscore.enums.EnchantmentLoadResponse
import com.roughlyunderscore.enums.EnchantmentUnloadResponse
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
  fun loadEnchantment(enchantmentName: String): EnchantmentLoadResponse

  /**
   * Attempts to unload an enchantment from a given [enchantmentName].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadEnchantment(enchantmentName: String): EnchantmentUnloadResponse

  /**
   * Attempts to load an enchantment pack from a given [packFile].
   * @return the response to the action
   */
  @Since("2.2")
  fun loadPack(packFile: File): EnchantmentLoadResponse

  /**
   * Attempts to unload an enchantment pack from a given [packFile].
   * @return the response to the action
   */
  @Since("2.2")
  fun unloadPack(packFile: File): EnchantmentUnloadResponse
}