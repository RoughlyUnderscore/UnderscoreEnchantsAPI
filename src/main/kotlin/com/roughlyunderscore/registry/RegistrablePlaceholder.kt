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
 * This interface is used to create placeholders.
 */
@Since("2.2")
interface RegistrablePlaceholder : Registrable {
  /**
   * Returns the string that should replace the placeholder. The implementation of this method should be done
   * so that if some failure occurs while creating a replacement for the placeholder, the method should return null.
   * For example, for a placeholder that returns the amount of money that a player has, if no economy provider is present,
   * the method will return null, otherwise it will return the stringified amount of money. [event],
   * [trigger] and [target] are used to determine the context of the placeholder, while [args] are the arguments
   * passed to the placeholder, if any.
   * @return the replacement text
   */
  @Since("2.2")
  fun replacedText(event: Event, trigger: RegistrableTrigger, target: TargetType, args: Map<String, String>): String?
}