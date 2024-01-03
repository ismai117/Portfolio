package org.ncgroup.portfolio

class AndroidPlatform : Platform {
    override val current: Platforms
        get() = Platforms.ANDROID
}

actual fun getPlatform(): Platform = AndroidPlatform()