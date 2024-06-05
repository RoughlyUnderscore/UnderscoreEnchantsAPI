package com.roughlyunderscore.annotations

/**
 * This annotation is used to mark a class, function, property or field as being available
 * since a given version.
 *
 * Can be applied to classes, methods, properties, fields and constructors.
 *
 * It is encouraged to use this annotation on every item, but it is not required.
 * This is a replacement for the `@since` Javadoc tag.
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD,
  AnnotationTarget.CONSTRUCTOR
)
@MustBeDocumented
@Since("2.2")
annotation class Since(val version: String = "")