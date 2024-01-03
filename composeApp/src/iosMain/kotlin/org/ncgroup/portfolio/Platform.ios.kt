package org.ncgroup.portfolio


class IosPlatform : Platform {
    override val current: Platforms
        get() = Platforms.IOS
}

actual fun getPlatform(): Platform = IosPlatform()