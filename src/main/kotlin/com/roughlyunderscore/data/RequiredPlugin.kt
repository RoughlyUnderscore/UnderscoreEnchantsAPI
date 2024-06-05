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

/**
 * This object represents a plugin that is required for an
 * enchantment to load. This is used to ensure that the enchantment that
 * depends on some other plugin (e.g. a provider of new actions) is not
 * loaded if the plugin is not present.
 */
@Since("2.2")
data class RequiredPlugin(
  /**
   * This is the name of the required plugin. This name must exactly match
   * the name of the plugin that is required for the enchantment to load.
   */
  val pluginName: String,

  /**
   * This field resembles an arbitrary string, which is displayed to the user
   * browsing enchantments/packs. It is recommended to use the name of the
   * plugin and a minimal version (e.g. `PlaceholderAPI 2.10.9+`), but it is not required.
   */
  val displayName: String,

  /**
   * This is the link to the plugin's page. This is used to direct the user to the
   * plugin's page in case the plugin is not installed.
   */
  val link: String,
) : Describable<RequiredPlugin> {
  companion object {
    val describer = object : Describer<RequiredPlugin> {
      override fun describeShortly(locale: UELocale, obj: RequiredPlugin?): String? {
        if (obj == null) return null
        return "${obj.pluginName} (${obj.displayName}), ${locale.tokenEnchantmentRequiredPluginLink}: ${obj.link}"
      }

      override fun describe(locale: UELocale, obj: RequiredPlugin?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<RequiredPlugin> = describer
}