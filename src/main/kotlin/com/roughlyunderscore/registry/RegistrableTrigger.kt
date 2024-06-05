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
import com.roughlyunderscore.data.TriggerDataHolder

/**
 * This interface is used to register triggers.
 */
@Since("2.2")
interface RegistrableTrigger : Registrable {
  /**
   * Returns the data holder for this trigger. For more information on what is a data holder,
   * refer to the documentations of [TriggerDataHolder].
   */
  @Since("2.2")
  fun getTriggerDataHolder(): TriggerDataHolder
}