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

package com.roughlyunderscore.registry

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.data.EventModifications
import com.roughlyunderscore.enums.TargetType
import org.bukkit.event.Event

/**
 * This interface is used to create registrable actions.
 */
@Since("2.2")
interface RegistrableAction : Registrable {
  /**
   * When an [event] happens and a [trigger] is fired, this method is called. The [arguments] are the arguments
   * that were passed to the trigger, and the [target] is the target of the action.
   * @return the modifications that should be applied to the event, or null if the event should not be modified.
   * It should be noted that the modifications will not be applied if the action is delayed in any way.
   * Events are modified when they are fired or not modified at all.
   */
  @Since("2.2")
  fun execute(event: Event, trigger: RegistrableTrigger, arguments: List<String>, target: TargetType): EventModifications?
}