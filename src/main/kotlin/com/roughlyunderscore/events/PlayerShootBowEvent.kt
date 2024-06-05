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
import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import org.bukkit.event.entity.EntityShootBowEvent
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.ItemStack

/**
 * This event is called when a player shoots a bow.
 * @param shooter The player who shot the bow.
 * @param bow The bow that was shot.
 * @param consumable The item that was consumed when the bow was shot.
 * @param projectile The projectile that was shot.
 * @param hand The hand that the bow was shot from.
 * @param force The force that the bow was shot with.
 * @param consumeHand Whether the hand that the bow was shot from should be consumed.
 * @property shooter The player who shot the bow.
 */
@Since("2.2")
@Stable
class PlayerShootBowEvent(
  val shooter: Player,
  val bow: ItemStack?,
  val consumable: ItemStack?,
  val projectile: Entity,
  val hand: EquipmentSlot,
  val force: Float,
  val consumeHand: Boolean
) : Event(), Cancellable
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