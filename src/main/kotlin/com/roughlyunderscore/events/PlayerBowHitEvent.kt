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
import com.roughlyunderscore.annotations.Stable
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import org.bukkit.event.entity.EntityDamageEvent

/**
 * This event is called when a player hits another player with a bow.
 * @param damager The player that shot the bow.
 * @param victim The player that was hit by the bow.
 * @param damage The damage that the victim will take.
 * @property cancel Whether the event is cancelled.
 */
@Since("2.2")
@Stable
class PlayerBowHitEvent(val damager: Player, val victim: Player, val damage: Double)
  : Event(), Cancellable
{
  private var cancel = false

  override fun getHandlers(): HandlerList {
    return Companion.handlers
  }

  companion object {
    @JvmStatic
    private val handlers = HandlerList()

    @JvmStatic
    fun getHandlerList(): HandlerList {
      return handlers
    }
  }

  override fun isCancelled(): Boolean = cancel

  override fun setCancelled(cancel: Boolean) {
    this.cancel = cancel
  }
}