package org.ncgroup.portfolio

enum class Platforms {
    ANDROID,
    IOS,
    DESKTOP,
    WEB
}

interface Platform {
    val current: Platforms
}

expect fun getPlatform(): Platform