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

import kotlinx.serialization.Serializable

/**
 * This class is used when fetching data about an enchantment/pack
 * from the server.
 */
@Serializable
class BackendEnchantmentCondition private constructor() {
  lateinit var name: String
  var negate: Boolean = false
  lateinit var target: String
  lateinit var arguments: List<String>

  class Builder {
    private val enchantmentCondition = BackendEnchantmentCondition()

    fun name(name: String) = apply { enchantmentCondition.name = name }
    fun negate(negate: Boolean) = apply { enchantmentCondition.negate = negate }
    fun target(target: String) = apply { enchantmentCondition.target = target }
    fun arguments(arguments: List<String>) = apply { enchantmentCondition.arguments = arguments }

    fun build() = enchantmentCondition
  }
}