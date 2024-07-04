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

import com.roughlyunderscore.data.UELocale
import com.roughlyunderscore.debug.Describable
import com.roughlyunderscore.debug.Describer
import kotlinx.serialization.Serializable

/**
 * This class is used when fetching data about an enchantment/pack
 * from the server.
 */
@Serializable
class ServerMeta : Describable<ServerMeta> {
  override fun getDescriber(): Describer<ServerMeta> = describer

  companion object {
    val describer = object : Describer<ServerMeta> {
      override fun describeShortly(locale: UELocale, obj: ServerMeta?): String? {
        if (obj == null) return null
        return "ID: ${obj.id}, ${locale.uiBrowsingDownloaded.lowercase().replace("<amount>", obj.downloadedTimes.toString())}"
      }

      override fun describe(locale: UELocale, obj: ServerMeta?): List<String> {
        if (obj == null) return emptyList()
        return listOf(
          "ID: ${obj.id}",
          locale.uiBrowsingDownloaded.replace("<amount>", obj.downloadedTimes.toString())
        )
      }
    }

    val PACK_PROVIDER = { id: Long -> Builder().id(id).type("pack").build() }
    val ENCH_PROVIDER = { id: Long -> Builder().id(id).type("ench").build() }
    val LOCALE_PROVIDER = { id: Long -> Builder().id(id).type("locale").build() }
  }


  lateinit var type: String
  var downloadedTimes: Int = 0
  var id: Long = 0

  class Builder {
    private val serverMeta = ServerMeta()

    fun downloadedTimes(downloadedTimes: Int) = apply { serverMeta.downloadedTimes = downloadedTimes }
    fun id(id: Long) = apply { serverMeta.id = id }
    fun type(type: String) = apply { serverMeta.type = type }

    fun build() = serverMeta
  }
}