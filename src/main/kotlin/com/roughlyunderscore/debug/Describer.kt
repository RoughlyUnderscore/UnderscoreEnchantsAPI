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

package com.roughlyunderscore.debug

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.data.UELocale

/**
 * This interface is used to describe an object in a debug-friendly way with the
 * usage of a [UELocale].
 * @property T the type of the object to describe
 */
@Since("2.2")
interface Describer<T> {
  /**
   * Describes the [obj] in a debug-friendly way with the usage of a [locale] in 1 line.
   * @return the description, or null if the object cannot be described in 1 line
   */
  @Since("2.2")
  fun describeShortly(locale: UELocale, obj: T?): String?

  /**
   * Describes the [obj] in a debug-friendly way with the usage of a [locale] in multiple lines.
   * If the object does not require multiple lines, this method should use a single-element list consisting of just [describeShortly]
   * instead of returning an empty list. If the underlying method returns null, this method should return an empty list.
   * @return the description
   */
  @Since("2.2")
  fun describe(locale: UELocale, obj: T?): List<String>
}