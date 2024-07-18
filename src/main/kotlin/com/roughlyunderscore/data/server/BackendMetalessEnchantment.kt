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

import com.roughlyunderscore.enums.EnchantmentPlayer
import com.roughlyunderscore.ulib.data.Time
import kotlinx.serialization.Serializable
import org.bukkit.Material

/**
 * This class is used when fetching data about an enchantment/pack
 * from the server.
 */
@Serializable
open class BackendMetalessEnchantment internal constructor() {
  var identifier: Long = 0
  lateinit var name: String
  lateinit var material: Material
  lateinit var author: String
  lateinit var description: List<String>
  lateinit var key: NamedKey
  var activationChance: Double = 0.0
  lateinit var cooldown: Time
  lateinit var trigger: String
  lateinit var indicator: String
  lateinit var applicables: List<String>
  lateinit var forbiddenMaterials: List<String>
  lateinit var conditions: List<BackendEnchantmentCondition>
  lateinit var conflicts: List<String>
  lateinit var levels: List<BackendEnchantmentLevel>
  lateinit var seekers: List<String>
  lateinit var targetPlayer: EnchantmentPlayer
  lateinit var restrictions: List<BackendObtainmentRestriction>
  var unique: Boolean = false
  lateinit var requiredEnchantments: List<BackendRequiredEnchantment>
  lateinit var worldBlacklist: List<String>
  lateinit var worldWhitelist: List<String>
  lateinit var requiredPlugins: List<BackendRequiredPlugin>

  fun toBackendEnchantment(newMeta: ServerMeta) = BackendEnchantment().apply {
    this@apply.identifier = this@BackendMetalessEnchantment.identifier
    this@apply.name = this@BackendMetalessEnchantment.name
    this@apply.material = this@BackendMetalessEnchantment.material
    this@apply.author = this@BackendMetalessEnchantment.author
    this@apply.description = this@BackendMetalessEnchantment.description
    this@apply.key = this@BackendMetalessEnchantment.key
    this@apply.activationChance = this@BackendMetalessEnchantment.activationChance
    this@apply.cooldown = this@BackendMetalessEnchantment.cooldown
    this@apply.trigger = this@BackendMetalessEnchantment.trigger
    this@apply.indicator = this@BackendMetalessEnchantment.indicator
    this@apply.applicables = this@BackendMetalessEnchantment.applicables
    this@apply.forbiddenMaterials = this@BackendMetalessEnchantment.forbiddenMaterials
    this@apply.conditions = this@BackendMetalessEnchantment.conditions
    this@apply.conflicts = this@BackendMetalessEnchantment.conflicts
    this@apply.levels = this@BackendMetalessEnchantment.levels
    this@apply.seekers = this@BackendMetalessEnchantment.seekers
    this@apply.targetPlayer = this@BackendMetalessEnchantment.targetPlayer
    this@apply.restrictions = this@BackendMetalessEnchantment.restrictions
    this@apply.unique = this@BackendMetalessEnchantment.unique
    this@apply.requiredEnchantments = this@BackendMetalessEnchantment.requiredEnchantments
    this@apply.worldBlacklist = this@BackendMetalessEnchantment.worldBlacklist
    this@apply.worldWhitelist = this@BackendMetalessEnchantment.worldWhitelist
    this@apply.requiredPlugins = this@BackendMetalessEnchantment.requiredPlugins
    meta = newMeta
  }

  class Builder {
    private val enchantment = BackendMetalessEnchantment()

    fun id(id: Long) = apply { enchantment.identifier = id }
    fun name(name: String) = apply { enchantment.name = name }
    fun material(material: Material) = apply { enchantment.material = material }
    fun author(author: String) = apply { enchantment.author = author }
    fun description(description: List<String>) = apply { enchantment.description = description }
    fun key(key: NamedKey) = apply { enchantment.key = key }
    fun activationChance(activationChance: Double) = apply { enchantment.activationChance = activationChance }
    fun cooldown(cooldown: Time) = apply { enchantment.cooldown = cooldown }
    fun trigger(trigger: String) = apply { enchantment.trigger = trigger }
    fun indicator(indicator: String) = apply { enchantment.indicator = indicator }
    fun applicables(applicables: List<String>) = apply { enchantment.applicables = applicables }
    fun forbiddenMaterials(forbiddenMaterials: List<String>) = apply { enchantment.forbiddenMaterials = forbiddenMaterials }
    fun conditions(conditions: List<BackendEnchantmentCondition>) = apply { enchantment.conditions = conditions }
    fun conflicts(conflicts: List<String>) = apply { enchantment.conflicts = conflicts }
    fun levels(levels: List<BackendEnchantmentLevel>) = apply { enchantment.levels = levels }
    fun seekers(seekers: List<String>) = apply { enchantment.seekers = seekers }
    fun targetPlayer(player: EnchantmentPlayer) = apply { enchantment.targetPlayer = player }
    fun restrictions(restrictions: List<BackendObtainmentRestriction>) = apply { enchantment.restrictions = restrictions }
    fun unique(unique: Boolean) = apply { enchantment.unique = unique }
    fun requiredEnchantments(requiredEnchantments: List<BackendRequiredEnchantment>) = apply { enchantment.requiredEnchantments = requiredEnchantments }
    fun worldBlacklist(worldBlacklist: List<String>) = apply { enchantment.worldBlacklist = worldBlacklist }
    fun worldWhitelist(worldWhitelist: List<String>) = apply { enchantment.worldWhitelist = worldWhitelist }
    fun requiredPlugins(requiredPlugins: List<BackendRequiredPlugin>) = apply { enchantment.requiredPlugins = requiredPlugins }

    fun build() = enchantment
  }
}