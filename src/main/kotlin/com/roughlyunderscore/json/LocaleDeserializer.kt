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

package com.roughlyunderscore.json

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.annotations.Stable
import com.roughlyunderscore.data.UELocale
import com.roughlyunderscore.ulib.json.anyObject
import com.roughlyunderscore.ulib.json.anyString
import com.roughlyunderscore.ulib.text.formatColor
import java.lang.reflect.Field
import java.lang.reflect.Type

@Since("2.2")
@Stable
/**
 * This is the deserializer that is used on UnderscoreEnchants' locales.
 * All messages are registered reflectively.
 */
object LocaleDeserializer : JsonDeserializer<UELocale?> {
  override fun deserialize(src: JsonElement?, type: Type?, ctx: JsonDeserializationContext?): UELocale? {
    val json = src?.asJsonObject ?: return null
    val identifier = json.anyString(DeserializationNames.Locale.IDENTIFIER) ?: return null
    val messages = json.anyObject(DeserializationNames.Locale.MESSAGES) ?: return null

    val locale = UELocale(identifier)
    val fields = iterateObject(UELocale(identifier), messages)

    for ((field, value) in fields) {
      field.isAccessible = true
      field.set(locale, value.formatColor())

      locale.mapping[field.name] = value
    }

    return locale
  }

  /**
   * Iterates through a [json] object, modifies the [initialLocale] accordingly
   * and returns the new locale. This iteration is **deep**, which means that
   * upon encountering another JSON object, this function will call itself on
   * that object.
   */
  @Since("2.2")
  fun iterateObject(initialLocale: UELocale, json: JsonObject): MutableMap<Field, String> {
    val map = mutableMapOf<Field, String>()
    json.entrySet().forEach {
      val name = it?.key ?: return@forEach
      val value = it.value ?: return@forEach

      if (value.isJsonObject) {
        map.putAll(iterateObject(initialLocale, value.asJsonObject))
        return@forEach
      }
      if (value.isJsonArray || value.isJsonNull) return@forEach

      val localeTermSplit = name.split("-")
      val capitalizedTermName = mutableListOf<String>()
      localeTermSplit.forEach { term ->
        capitalizedTermName.add(term.replaceFirstChar { char -> char.uppercase() })
      }

      val termName = capitalizedTermName.joinToString("").replaceFirstChar { char -> char.lowercase() }

      val field = try {
        initialLocale::class.java.getDeclaredField(termName)
      } catch (ex: Exception) { return@forEach }

      map[field] = value.asString
    }

    return map
  }
}