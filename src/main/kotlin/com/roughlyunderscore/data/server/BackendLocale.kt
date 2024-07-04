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

package com.roughlyunderscore.data.server

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.annotations.Stable
import com.roughlyunderscore.data.UELocale
import kotlinx.serialization.Serializable

@Serializable
@Since("2.2")
@Stable
class BackendLocale private constructor() {
  lateinit var locale: UELocale
  lateinit var meta: ServerMeta

  class Builder {
    private val backendLocale = BackendLocale()

    fun locale(locale: UELocale) = apply { backendLocale.locale = locale }
    fun meta(meta: ServerMeta) = apply { backendLocale.meta = meta }
    fun build() = backendLocale
  }
}