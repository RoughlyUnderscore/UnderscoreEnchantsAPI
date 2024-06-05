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
import org.bukkit.entity.Player

/**
 * This interface is used to create registrable activation indicators.
 */
@Since("2.2")
interface RegistrableActivationIndicator : Registrable {
  /**
   * This method indicates to the [player] that the enchantment has been activated.
   * This method should display [text] to the player in a desired way.
   */
  @Since("2.2")
  fun indicateAboutActivation(text: String, player: Player)
}