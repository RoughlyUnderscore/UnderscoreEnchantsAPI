# Annotations

Annotations are used to store various metadata about functions, classes, and properties. They do not change how the code works, but rather indicate how it should be treated by other developers and tools.

## Beta
This annotation is used to mark items that are in beta.
```kotlin
@BetaItem
fun someUntestedItem() {
  // ...
}
```

## MarkedForRemoval
This annotation is used to mark items that will be removed in the next major release and should not be used.
```kotlin
@MarkedForRemoval
fun someBadlyCodedItem() {
  // ...
}
```

## Since
This annotation is used to mark the version in which an item was added. It is a replacement for the `@since` Javadoc tag.
```kotlin
@Since("2.2")
fun someItem() {
  // ...
}
```

## Stable
This annotation is used to mark items that are stable and can be used in production.
```kotlin
@Stable
fun someStableItem() {
  // ...
}
```

# Annotations roadmap
- [ ] Nothing yet!