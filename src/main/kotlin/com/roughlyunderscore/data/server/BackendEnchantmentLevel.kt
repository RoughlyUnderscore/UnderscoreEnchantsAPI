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
class BackendEnchantmentLevel private constructor() {
  var index: Int = 0
  lateinit var conditions: List<BackendEnchantmentCondition>
  var chance: Double = 0.0
  lateinit var cooldown: Time
  lateinit var actions: List<BackendEnchantmentAction>

  class Builder {
    private val enchantmentLevel = BackendEnchantmentLevel()

    fun index(index: Int) = apply { enchantmentLevel.index = index }
    fun conditions(conditions: List<BackendEnchantmentCondition>) = apply { enchantmentLevel.conditions = conditions }
    fun chance(chance: Double) = apply { enchantmentLevel.chance = chance }
    fun cooldown(cooldown: Time) = apply { enchantmentLevel.cooldown = cooldown }
    fun actions(actions: List<BackendEnchantmentAction>) = apply { enchantmentLevel.actions = actions }

    fun build() = enchantmentLevel
  }
}