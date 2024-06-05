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
import com.roughlyunderscore.enums.TargetType
import org.bukkit.event.Event

/**
 * This interface is used to create registrable conditions.
 */
@Since("2.2")
interface RegistrableCondition : Registrable {
  /**
   * Evaluates the condition, given the [trigger], [event], [target] and [arguments].
   * @return true if the condition is met, false otherwise
   * @since 2.2
   */
  fun evaluateCondition(trigger: RegistrableTrigger, event: Event, target: TargetType, arguments: List<String>): Boolean
}