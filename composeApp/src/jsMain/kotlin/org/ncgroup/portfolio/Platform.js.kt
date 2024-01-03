package org.ncgroup.portfolio


class WebPlatform : Platform {
    override val current: Platforms
        get() = Platforms.WEB
}

actual fun getPlatform(): Platform = WebPlatform()