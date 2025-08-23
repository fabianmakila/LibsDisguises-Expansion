plugins {
	java
}

description = "Lib's Disguises Expansion for MiniPlaceholders"
version = "1.0.0-SNAPSHOT"

dependencies {
	compileOnly("io.github.miniplaceholders:miniplaceholders-api:3.0.1")
	compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")
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
