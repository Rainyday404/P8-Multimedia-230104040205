// build.gradle.kts (root)
plugins {
    // Tidak menambahkan plugin yang memerlukan repositories di sini
}

// contoh task global untuk membersihkan folder build
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}