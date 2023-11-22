plugins {
    id("java")
}

group = "net.bypiramid.reflectionapi"
version = "git-1.0-SNAPSHOT"

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}