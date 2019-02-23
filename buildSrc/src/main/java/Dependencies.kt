object Versions {
    val gradle = "3.3.1"
    val kotlin = "1.3.20"
    val support_lib = "1.0.0-beta01"
    val core_ktx = "1.1.0-alpha04"
    val constraint_layout = "1.1.3"
    val koin_version = "2.0.0-beta-1"
    val junit = "4.12"
    val androidx_testrunner = "1.1.2-alpha01"
    val androidx_espresso = "3.1.0-alpha4"
}

object Libraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
}

object SupportLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.support_lib}"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
}

object TestingLibraries {
    val junit = "junit:junit:${Versions.junit}"
    val androidx_testrunner = "androidx.test:runner:${Versions.androidx_testrunner}"
    val androidx_espresso = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"
}