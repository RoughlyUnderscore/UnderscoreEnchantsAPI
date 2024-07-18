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

package com.roughlyunderscore.events

import com.roughlyunderscore.annotations.Since
import org.bukkit.NamespacedKey
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * This event is called when a player activates an enchantment.
 * @param player The player who activated the enchantment.
 * @param key The key of the enchantment that was activated.
 * @property cancel Whether the event is cancelled.
 */
@Since("2.2")
class EnchantmentActivateEvent(val player: Player, val key: NamespacedKey, val level: Int): Event(), Cancellable {
  private var cancel = false

  override fun getHandlers() = Companion.handlers

  companion object {
    @JvmStatic
    private val handlers = HandlerList()

    @JvmStatic
    fun getHandlerList() = handlers
  }

  override fun isCancelled(): Boolean = cancel

  override fun setCancelled(cancel: Boolean) {
    this.cancel = cancel
  }
}