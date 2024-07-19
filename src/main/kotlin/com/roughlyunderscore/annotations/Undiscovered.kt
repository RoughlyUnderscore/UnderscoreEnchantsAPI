package com.roughlyunderscore.annotations

import com.roughlyunderscore.registry.*

/**
 * This annotation is used to indicate that a [Registrable] loaded in an enchantment
 * has not been discovered in the registry. This may happen when an enchantment is loaded
 * but some [Registrable] item that it uses is provided by another plugin that is not loaded
 * yet. The annotation is used internally to mark such [Registrable]s and reload the
 * enchantments that have [Undiscovered] items when receiving [UEAPIRegistry.provide].
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@MustBeDocumented
@Since("2.2")
annotation class Undiscovered
