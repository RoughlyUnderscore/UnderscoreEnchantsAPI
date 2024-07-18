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
import com.roughlyunderscore.enums.DataRetrievalType
import org.bukkit.event.Event
import java.lang.reflect.Method
import com.roughlyunderscore.registry.RegistrableTrigger
import org.jetbrains.annotations.ApiStatus.Internal

/**
 * This class helps store [RegistrableTrigger]'s event-related data, such as
 * the event class and its data retrieval methods.
 *
 * When creating a [TriggerDataHolder], make sure to always include a [DataRetrievalType.FIRST_PLAYER] method.
 * @since 2.2
 */
@Since("2.2")
class TriggerDataHolder private constructor(val eventType: Class<out Event>) {
  val dataRetrievalMethods = mutableMapOf<DataRetrievalType, Method>()

  /**
   * Instantiates a [TriggerDataHolder] with the given [eventType] (the type of the trigger event)
   * and [methods] (the methods, encapsulated in pairs of [DataRetrievalType] and [Method]).
   *
   * When creating a [TriggerDataHolder], make sure to always include a [DataRetrievalType.FIRST_PLAYER] method.
   */
  @Since("2.2")
  constructor(eventType: Class<out Event>, vararg methods: Pair<DataRetrievalType, Method>) : this(eventType) {
    require(methods.any { method -> method.first == DataRetrievalType.FIRST_PLAYER }) {
      "At least one method must be of type FIRST_PLAYER method, which returns a method to obtain the player who activated the enchantment."
    }

    methods.forEach { method -> dataRetrievalMethods[method.first] = method.second }
  }

  companion object {
    /**
     * This is an empty [TriggerDataHolder]. It is used internally to create an undiscovered trigger.
     */
    @Internal
    @Deprecated("This should not be used by plugins. See the documentation")
    val EMPTY = TriggerDataHolder(Event::class.java)

    /**
     * Does the same thing as the public constructor, but creates the methods from strings. If the method has not been found,
     * skips the entry entirely. [eventType] is the type of the trigger event and [methods] are the methods, encapsulated in pairs of
     * [DataRetrievalType] and [String].
     *
     * When creating a [TriggerDataHolder], make sure to always include a [DataRetrievalType.FIRST_PLAYER] method.
     * @return the resulting [TriggerDataHolder].
     */
    @Since("2.2")
    fun fromStringMethods(eventType: Class<out Event>, vararg methods: Pair<DataRetrievalType, String>): TriggerDataHolder {
      require(methods.any { method -> method.first == DataRetrievalType.FIRST_PLAYER }) {
        "At least one method must be of type FIRST_PLAYER method, which returns a method to obtain the player who activated the enchantment."
      }

      val holder = TriggerDataHolder(eventType)

      for (entry in methods) {
        try {
          val method = eventType.getMethod(entry.second)
          holder.dataRetrievalMethods[entry.first] = method
        } catch (ex: NoSuchMethodException) {
          continue
        }
      }

      return holder
    }
  }
}