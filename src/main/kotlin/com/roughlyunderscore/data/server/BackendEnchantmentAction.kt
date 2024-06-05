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

package com.roughlyunderscore.data.server

import com.roughlyunderscore.ulib.data.Time
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * This class is used when fetching data about an enchantment/pack
 * from the server.
 */
@Serializable
class BackendEnchantmentAction private constructor() {
  lateinit var name: String
  var chance: Double = 0.0
  lateinit var delay: Time
  lateinit var target: String
  lateinit var arguments: List<String>
  lateinit var conditions: List<BackendEnchantmentCondition>

  class Builder {
    private val enchantmentAction = BackendEnchantmentAction()

    fun name(name: String) = apply { enchantmentAction.name = name }
    fun chance(chance: Double) = apply { enchantmentAction.chance = chance }
    fun delay(delay: Time) = apply { enchantmentAction.delay = delay }
    fun target(target: String) = apply { enchantmentAction.target = target }
    fun arguments(arguments: List<String>) = apply { enchantmentAction.arguments = arguments }
    fun conditions(conditions: List<BackendEnchantmentCondition>) = apply { enchantmentAction.conditions = conditions }

    fun build() = enchantmentAction
  }
}