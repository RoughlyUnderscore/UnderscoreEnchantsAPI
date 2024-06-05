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
import org.bukkit.plugin.java.JavaPlugin

/**
 * The RegistrableProvider is a holder for all registrable objects that your plugin provides
 * to the API. The usage for this class is the reloading process - it would be difficult
 * to reliably unload and load back registrables by a certain plugin without a constant
 * provider holding everything at all time.
 *
 * The usage of this interface is very simple: it can be implemented anonymously and then
 * fed to the registry at any time.
 *
 * The implementation of the registry is such that upon providing a registrable provider,
 * the registry ensures that the associated plugin is enabled and then immediately registers
 * all the provided registrables. Upon reloading the plugin, all registrables are dropped;
 * the registry then goes through all providers and loads the provided registrables
 * **if and only if** the plugin is enabled. If not, the provided registrables are skipped.
 * @sample com.roughlyunderscore.sample.RegistrablesProviderExample
 */
@Since("2.2")
interface RegistrablesProvider {
  /**
   * Retrieves the plugin associated with this provider.
   */
  @Since("2.2")
  fun getAssociatedPlugin(): JavaPlugin

  /**
   * Retrieves all the provided registrable tokens.
   */
  @Since("2.2")
  fun getProvidedRegistrables(): List<Registrable>
}