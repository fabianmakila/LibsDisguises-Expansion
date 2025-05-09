import xyz.jpenilla.resourcefactory.paper.PaperPluginYaml

plugins {
    java
    id("xyz.jpenilla.resource-factory-paper-convention") version "1.2.1"
}

description = "Lib's Disguises Expansion for MiniPlaceholders"
version = "1.0.0-SNAPSHOT"

dependencies {
    compileOnly("io.github.miniplaceholders:miniplaceholders-api:2.3.0")
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    compileOnly("me.libraryaddict.disguises:libsdisguises:11.0.0")
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.md-5.net/content/groups/public/")
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(21))
tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
    }
}

paperPluginYaml {
    main = "io.github.miniplaceholders.expansion.libsdisguises.paper.PaperPlugin"
    apiVersion = "1.21.4"
    authors.add("FabianAdrian")
    foliaSupported = true
    dependencies {
        server {
            register("MiniPlaceholders") {
                required = true
                load = PaperPluginYaml.Load.BEFORE
            }
            register("LibsDisguises") {
                required = true
                load = PaperPluginYaml.Load.BEFORE
            }
        }
    }
}
