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

package com.roughlyunderscore.sample

import com.roughlyunderscore.UEAPI
import com.roughlyunderscore.registry.Registrable
import com.roughlyunderscore.registry.RegistrablesProvider
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

/**
 * This is an example of how to provide registrables to the API.
 * Do note that this is not a complete example, and some things may be omitted
 * for the sake of brevity.
 */
class RegistrablesProviderExample : JavaPlugin() {
  val provider = Bukkit.getServicesManager().getRegistration(UEAPI::class.java) ?: TODO() // throw an exception or something
  val ueApi = provider.provider

  override fun onEnable() {
    val provider = object: RegistrablesProvider {
      override fun getAssociatedPlugin(): JavaPlugin = this@RegistrablesProviderExample
      override fun getProvidedRegistrables(): List<Registrable> = listOf() // Your registrables
    }

    ueApi.getRegistry().provide(provider)
  }
}