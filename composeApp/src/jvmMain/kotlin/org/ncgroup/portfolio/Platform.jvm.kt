package org.ncgroup.portfolio


class DesktopPlatform : Platform {
    override val current: Platforms
        get() = Platforms.DESKTOP
}

actual fun getPlatform(): Platform = DesktopPlatform()