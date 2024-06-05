package com.roughlyunderscore.annotations

/**
 * This annotation is used to mark an items that are not yet confirmed to be
 * stable and production-ready to the fullest extent.
 *
 * Can be applied to classes, methods, properties and fields.
 *
 * Not every beta item must have this annotation, but every item with this annotation is not
 * necessarily stable.
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@MustBeDocumented
@Since("2.2")
annotation class Beta
