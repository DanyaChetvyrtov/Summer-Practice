plugins {
    id("java")
}

group = "ru.danil.algos"
version = "1.0-SNAPSHOT"

tasks.jar {
    manifest {
        attributes["Main-Class"] = "ru.danil.algos.Main"
    }
}


// Для сборки с русскими символами
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

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