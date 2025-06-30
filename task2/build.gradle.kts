plugins {
    id("java")
}

// for executable jar
tasks.jar {
    manifest {
        attributes["Main-Class"] = "ru.danil.algos.Main"
    }
}

group = "ru.danil.algos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
