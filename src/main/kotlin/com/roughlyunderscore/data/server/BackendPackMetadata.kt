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
import kotlinx.serialization.Transient
import org.bukkit.Material

@Serializable
class BackendPackMetadata private constructor() {
  lateinit var name: String
  lateinit var version: String
  lateinit var authors: List<String>
  lateinit var description: List<String>
  lateinit var website: String
  lateinit var worldBlacklist: List<String>
  lateinit var worldWhitelist: List<String>
  lateinit var material: Material
  /* @Transient */ lateinit var meta: ServerMeta

  class Builder {
    private val packMetadata = BackendPackMetadata()

    fun name(name: String) = apply { packMetadata.name = name }
    fun version(version: String) = apply { packMetadata.version = version }
    fun authors(authors: List<String>) = apply { packMetadata.authors = authors }
    fun description(description: List<String>) = apply { packMetadata.description = description }
    fun website(website: String) = apply { packMetadata.website = website }
    fun worldBlacklist(worldBlacklist: List<String>) = apply { packMetadata.worldBlacklist = worldBlacklist }
    fun worldWhitelist(worldWhitelist: List<String>) = apply { packMetadata.worldWhitelist = worldWhitelist }
    fun meta(meta: ServerMeta) = apply { packMetadata.meta = meta }
    fun material(material: Material) = apply { packMetadata.material = material }

    fun build() = packMetadata
  }
}