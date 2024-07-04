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
import com.roughlyunderscore.registry.RegistrableEnchantment

/**
 * This class represents an enchantment pack.
 *
 * An enchantment pack is a collection of enchantments that are grouped together.
 *
 * At no point should you need to construct this class, as it is only created internally by UnderscoreEnchants.
 */
@Since("2.2")
data class EnchantmentPack(
  val metadata: EnchantmentPackMetadata,
  val enchantments: List<RegistrableEnchantment>
) : Describable<EnchantmentPack> {
  companion object {
    val describer = object : Describer<EnchantmentPack> {
      override fun describeShortly(locale: UELocale, obj: EnchantmentPack?): String? {
        if (obj == null) return null

        val metadata = obj.metadata.getDescriber().describeShortly(locale, obj.metadata)
        val enchantmentNames = obj.enchantments.mapNotNull { it.aliases.firstOrNull() }

        return "$metadata; ${locale.tokenEnchantments}: ${enchantmentNames.joinToString(", ")}"
      }

      override fun describe(locale: UELocale, obj: EnchantmentPack?): List<String> {
        describeShortly(locale, obj)?.let { return listOf(it) } ?: return emptyList()
      }
    }
  }

  override fun getDescriber(): Describer<EnchantmentPack> = describer
}