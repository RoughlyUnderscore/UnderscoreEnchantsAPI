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

@Serializable
class BackendEnchantmentPack private constructor() {
  var identifier: Long = 0
  lateinit var metadata: BackendPackMetadata
  lateinit var enchantments: List<BackendMetalessEnchantment>

  class Builder {
    private val enchantmentPack = BackendEnchantmentPack()

    fun id(id: Long) = apply { enchantmentPack.identifier = id }
    fun metadata(metadata: BackendPackMetadata) = apply { enchantmentPack.metadata = metadata }
    fun enchantments(enchantments: List<BackendMetalessEnchantment>) = apply { enchantmentPack.enchantments = enchantments }

    fun build() = enchantmentPack
  }
}