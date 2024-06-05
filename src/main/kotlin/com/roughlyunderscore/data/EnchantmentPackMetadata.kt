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
import org.bukkit.Material

/**
 * This class contains metadata about an enchantment pack.
 *
 * At no point should you need to construct this class, as it is only created internally by UnderscoreEnchants.
 */
@Since("2.2")
data class EnchantmentPackMetadata (
  val name: String,
  val version: String,
  val authors: List<String>,
  val description: List<String>,
  val website: String?,
  val worldBlacklist: List<String>,
  val worldWhitelist: List<String>,
  val item: Material
) : Describable<EnchantmentPackMetadata> {
  companion object {
    val describer = object : Describer<EnchantmentPackMetadata> {
      override fun describeShortly(locale: UELocale, obj: EnchantmentPackMetadata?): String? {
        if (obj == null) return null

        val name = obj.name
        val version = obj.version
        val authors = obj.authors.joinToString(", ")
        val website =
          if (obj.website != null) " (${obj.website})"
          else ""
        val blacklist =
          if (obj.worldBlacklist.isEmpty()) ""
          else " (${locale.tokenEnchantmentBlacklist}: ${obj.worldBlacklist.joinToString(", ")})"
        val whitelist =
          if (obj.worldWhitelist.isEmpty()) ""
          else " (${locale.tokenEnchantmentWhitelist}: ${obj.worldWhitelist.joinToString(", ")})"
        val description =
          if (obj.description.isEmpty()) ""
          else " (${obj.description.joinToString(", ")})"

        return "$name v$version (${obj.item.name}) ${locale.tokenEnchantmentBy} $authors$website$blacklist$whitelist$description"
      }

      override fun describe(locale: UELocale, obj: EnchantmentPackMetadata?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<EnchantmentPackMetadata> = describer

  class Builder {
    private var name: String? = null
    private var version: String? = null
    private var authors: List<String>? = null
    private var description: List<String>? = null
    private var website: String? = null
    private var worldBlacklist: List<String>? = null
    private var worldWhitelist: List<String>? = null
    private var material: Material? = null

    fun name(name: String) = apply { this.name = name }
    fun version(version: String) = apply { this.version = version }
    fun authors(authors: List<String>) = apply { this.authors = authors }
    fun description(description: List<String>) = apply { this.description = description }
    fun website(website: String) = apply { this.website = website }
    fun worldBlacklist(worldBlacklist: List<String>) = apply { this.worldBlacklist = worldBlacklist }
    fun worldWhitelist(worldWhitelist: List<String>) = apply { this.worldWhitelist = worldWhitelist }
    fun material(material: Material) = apply { this.material = material }

    fun build(): EnchantmentPackMetadata {
      return EnchantmentPackMetadata(
        name ?: throw IllegalStateException("Name must be set"),
        version ?: throw IllegalStateException("Version must be set"),
        authors ?: throw IllegalStateException("Authors must be set"),
        description ?: throw IllegalStateException("Description must be set"),
        website,
        worldBlacklist ?: throw IllegalStateException("World blacklist must be set"),
        worldWhitelist ?: throw IllegalStateException("World whitelist must be set"),
        material ?: throw IllegalStateException("Material must be set")
      )
    }
  }
}