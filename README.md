# UnderscoreEnchantsAPI
This API contains various methods for other Spigot/Paper plugins to interact with UnderscoreEnchants. Primarily it serves as a place to create and register one's own registrable entries (actions, placeholders, etc.)

The full comprehensive documentation can be found [here: https://ue.runderscore.com/docs](https://ue.runderscore.com/docs). This README only contains the primary information about how to add and begin using the API.

The KDocs are available [here: https://ue.runderscore.com/javadocs/index.html](https://ue.runderscore.com/javadocs/index.html).

## Getting started
To add this API to your project, use a build system like Maven or Gradle:
```xml
<!-- Repository -->
<repository>
    <id>roughly-underscore</id>
    <url>https://repo.runderscore.com/releases</url>
</repository>

<!-- Dependency -->
<dependency>
    <groupId>com.roughlyunderscore</groupId>
    <artifactId>UnderscoreEnchantsAPI</artifactId>
    <version>2.2.0</version>
</dependency>
```

```kotlin
// Repository
maven("https://repo.runderscore.com/releases")

// Dependency
implementation("com.roughlyunderscore:UnderscoreEnchantsAPI:2.2.0")
```
To ensure that your plugin will not start without UnderscoreEnchants loaded, add a dependency to your plugin.yml:
```yml
# Use soft-depend if UnderscoreEnchants is optional
depend: [ UnderscoreEnchants ]
```

In your onEnable(), initialize the UnderscoreEnchantsAPI instance:
```kotlin
lateinit var ueApi: UEAPI

override fun onEnable() {
  ueApi = Bukkit.getServicesManager().getRegistration(UEAPI::class.java)?.provider ?: run {
    Bukkit.getLogger().severe("No UnderscoreEnchants API implementation found!")
    return
  }
}
```
```java
UEAPI ueApi = null;

@Override
public void onEnable() {
  RegisteredServiceProvider<UEAPI> rsp = Bukkit.getServicesManager().getRegistration(UEAPI.class);
  if (rsp != null) {
    ueApi = rsp.getProvider();
  }

  if (ueApi == null) {
    Bukkit.getLogger().severe("No UnderscoreEnchants API implementation found!");
    return;
  }
}
```

### Common use cases
Enchanting/disenchanting an item
```kotlin
val enchanter = ueApi.enchanter

// Enchanting an item
val response = enchanter.enchant(item, enchantmentKey, level, listOf(
  // Ignored restrictions
  EnchantingRestriction.CONFLICT_RESTRICTION, EnchantingRestriction.UNAPPLICABLE_RESTRICTION
))

if (response.type == ItemStackEnchantResponseType.SUCCESS) {
  val item = response.item
}

// Disenchanting an item
val newItem = enchanter.fullyDisenchant(item)
```
```java
UEEnchanter enchanter = ueApi.getEnchanter();

// Enchanting an item
ItemStackEnchantResponse response = enchanter.enchant(item, enchantmentKey, level, Arrays.asList(
  // Ignored restrictions
  EnchantingRestriction.CONFLICT_RESTRICTION, EnchantingRestriction.UNAPPLICABLE_RESTRICTION
));

if (response.type == ItemStackEnchantResponseType.SUCCESS) {
  ItemStack item = response.getItem();
}

// Disenchanting an item
ItemStack newItem = enchanter.fullyDisenchant(item);
```
