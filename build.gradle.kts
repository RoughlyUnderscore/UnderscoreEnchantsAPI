import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.net.URL

plugins {
  id("io.github.goooler.shadow") version("8.1.8")
  `maven-publish`
  id("org.jetbrains.dokka") version "1.9.20"
  kotlin("jvm") version("2.0.0")
  kotlin("plugin.serialization") version "2.0.0"
}

// ArtifactId is project name in settings.gradle.kts
group = "com.roughlyunderscore"
version = "2.2.0"

repositories {
  mavenCentral()
  maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
  maven("https://repo.runderscore.com/releases")
}

dependencies {
  compileOnly("org.jetbrains:annotations:24.1.0")
  compileOnly("org.spigotmc:spigot-api:1.20.6-R0.1-SNAPSHOT")
  compileOnly("com.google.code.gson:gson:2.11.0")
  implementation("com.roughlyunderscore:ULib:1.0")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
}

tasks.shadowJar {
  this.archiveClassifier.set("")
  this.archiveVersion.set("")
}

tasks.compileKotlin {
  compilerOptions.jvmTarget.set(JvmTarget.JVM_16)
}

kotlin {
  jvmToolchain(16)
}

tasks.register<Jar>("dokkaJavadocJar") {
  dependsOn(tasks.dokkaJavadoc)
  from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
  archiveClassifier.set("javadoc")
}

tasks.register("buildAndUpload") {
  dependsOn(tasks.build, tasks.shadowJar, tasks.publish, tasks.publishToMavenLocal, tasks.dokkaHtml)
}

tasks.register("buildAndInstall") {
  dependsOn(tasks.build, tasks.shadowJar, tasks.publishToMavenLocal, tasks.dokkaHtml)
}

publishing {
  publications {
    create<MavenPublication>("Maven") {
      project.shadow.component(this)

      this.artifact(tasks.named("dokkaJavadocJar"))
      this.artifact(tasks.kotlinSourcesJar)
    }
  }

  repositories {
    maven("https://repo.runderscore.com/releases") {
      credentials {
        this.username = System.getenv("roughlyUnderscoreRepoUsername")
        this.password = System.getenv("roughlyUnderscoreRepoPassword")
      }
    }
  }
}