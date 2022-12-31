[![License](https://img.shields.io/github/license/zbll-cuber/underscoreenchantsapi.svg?style=flat-square)](https://github.com/ZBLL-CUBER/UnderscoreEnchantsAPI/blob/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.zbll-cuber.enchantsapi/UnderscoreEnchantsAPI.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.zbll-cuber.enchantsapi%22%20AND%20a:%22UnderscoreEnchantsAPI%22)
# UnderscoreEnchantsAPI
This is the API for my project [UnderscoreEnchants](https://www.spigotmc.org/resources/97002/).
UnderscoreEnchantsAPI is hosted in Maven Central, so it's trivially easy to use it in your projects!
### Dependency
```xml
<dependency>
  <groupId>io.github.zbll-cuber.enchantsapi</groupId>
  <artifactId>UnderscoreEnchantsAPI</artifactId>
  <version>2.1.2</version> <!-- Make sure to always use the latest version! -->
  <scope>provided</scope>
</dependency>
```
### How to use it
```java
// 1) Create an undeclared UEnchantsAPI instance
public UEnchantsAPI ueAPI;
@Override
public void onEnable() {
  
  // 2) Make sure that UnderscoreEnchants is installed
  Plugin plugin = getServer().getPluginManager().getPlugin("UnderscoreEnchants");
  if (plugin == null) {
    getLogger().severe("UnderscoreEnchants is not installed!");
    return;
  }
  // 3) Cast
  ueAPI = (UEnchantsAPI) plugin;
    
  // How to use the methods?
  ueAPI.enchant();
  // Easy as that.
}
```
If you want to use the methods from other classes, access this very instance with dependency injection of the main class.
```java
class AnotherClass {
  private final MainClass mc;
  public AnotherClass(MainClass mc) {
    this.mc = mc;
  }
  
  public void usage() {
    mc.ueAPI.enchant();
  }
}
```
Listening to events is nothing new.
```java
@EventHandler
public void onAnvilCombine(EnchantmentsCombineEvent ev) {
}
```

#### If you would like to see the implementation of this API in UnderscoreEnchants, click [here](https://github.com/ZBLL-CUBER/UnderscoreEnchantsCode/blob/master/src/main/java/com/roughlyunderscore/enchs/UnderscoreEnchants.java#L940).
