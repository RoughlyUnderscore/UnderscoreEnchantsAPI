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
import java.lang.reflect.Field
import java.lang.reflect.Method
import com.roughlyunderscore.registry.RegistrableAction

/**
 * A list of event modifications. By itself, this class is just a data holder. It is
 * used by [RegistrableAction]s to modify events.
 */
@Since("2.2")
class EventModifications(val fieldModifications: Map<Field, Any>?, val methodsToCall: Map<Method, List<Any?>>?) {
  /**
   * Builder for [EventModifications].
   */
  @Since("2.2")
  class Builder {
    private val fieldModifications: MutableMap<Field, Any> = HashMap()
    private val methodsToCall: MutableMap<Method, List<Any?>> = HashMap()

    /**
     * Adds a field modification to this builder.
     */
    @Since("2.2")
    fun addFieldModification(field: Field, value: Any): Builder {
      fieldModifications[field] = value
      return this
    }

    /**
     * Adds a method to call to this builder.
     */
    @Since("2.2")
    fun addMethodToCall(method: Method, value: List<Any?>): Builder {
      methodsToCall[method] = value
      return this
    }

    /**
     * Builds the [EventModifications] object.
     */
    @Since("2.2")
    fun build(): EventModifications = EventModifications(fieldModifications, methodsToCall)
  }
}