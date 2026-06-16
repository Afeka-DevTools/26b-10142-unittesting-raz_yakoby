plugins {
    jacoco
}

tasks.register("jacocoTestReport") {
    dependsOn(subprojects.map { it.tasks.named("jacocoTestReport") })
}
