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
import org.bukkit.Material

/**
 * This interface is used to create registrable applicables.
 */
@Since("2.2")
interface RegistrableApplicable : Registrable {
  /**
   * This method returns whether the enchantment with this applicable
   * can be applied to the given [type].
   * @return whether the material suits this applicable
   */
  @Since("2.2")
  fun canBeAppliedTo(type: Material): Boolean

  /**
   * This method indicates whether this applicable is registered
   * or dynamically created (false if registered, true if dynamically
   * created). Dynamically created applicables are those that start
   * with `#` and indicate singular [Material]s. Please do not override
   * this method and set it to true if you are just creating a registrable
   * applicable. This is only internally overridden by the enchantment deserializer.
   */
  @Since("2.2")
  val custom: Boolean get() = false
}