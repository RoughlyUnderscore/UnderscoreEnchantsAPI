package com.roughlyunderscore.annotations

/**
 * This annotation is used to mark an items that are marked for removal in the next major release.
 * It is used to discourage the use of the item, and to give a warning to the developer.
 *
 * Can be applied to classes, methods, properties and fields.
 *
 * Not every item marked for removal must have this annotation, but every item with this annotation is marked for removal.
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@MustBeDocumented
@Since("2.2")
annotation class MarkedForRemoval
