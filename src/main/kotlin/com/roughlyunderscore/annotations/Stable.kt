package com.roughlyunderscore.annotations

/**
 * This annotation is used to mark an item as stable and ready for production use.
 *
 * Can be applied to classes, interfaces, methods and fields.
 *
 * Not every stable item must have this annotation, but every item with this annotation is stable.
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@MustBeDocumented
@Since("2.2")
annotation class Stable
