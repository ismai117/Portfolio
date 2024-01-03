package org.ncgroup.portfolio


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import org.ncgroup.portfolio.components.BottomBar
import org.ncgroup.portfolio.components.MobileTopAppBar
import org.ncgroup.portfolio.components.NonMobileTopAppBar
import org.ncgroup.portfolio.mobileLayout.MobileLayout
import org.ncgroup.portfolio.mobileLayout.MobileProjectsSheet
import org.ncgroup.portfolio.nonMobileLayout.NonMobileLayout
import org.ncgroup.portfolio.nonMobileLayout.NonMobileProjectsSheet
import org.ncgroup.portfolio.theme.AppTheme
import org.ncgroup.portfolio.theme.LocalThemeIsDark

//@Aboo1922
// ./gradlew :composeApp:jsBrowserDevelopmentRun

//  ./gradlew composeApp:JsBrowserProductionWebpack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun App(
    modifier: Modifier = Modifier
) = AppTheme {

    var isDark by LocalThemeIsDark.current

    var currentWidth by remember { mutableStateOf(0.dp) }
    val density = LocalDensity.current

    var showProjects by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxSize()
            .onGloballyPositioned {
                currentWidth = with(density) {
                    it.size.width.toDp()
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Scaffold(
            topBar = {
                if (currentWidth > 650.dp) {
                    NonMobileTopAppBar(
                        openProjects = {
                            showProjects = true
                        }
                    )
                } else {
                    MobileTopAppBar(
                        openProjects = {
                            showProjects = true
                        }
                    )
                }
            },
            bottomBar = {
                BottomBar()
            },
            modifier = modifier
                .padding(0.dp)
                .widthIn(max = 1200.dp),
            contentWindowInsets = WindowInsets(0.dp)
        ) { paddingValues ->
            if (currentWidth > 1176.dp) {
                NonMobileLayout(
                    paddingValues = paddingValues
                )
            } else {
                MobileLayout(
                    currentWidth = currentWidth,
                    paddingValues = paddingValues
                )
            }
        }

        if (showProjects){
            if (currentWidth > 650.dp) {
                NonMobileProjectsSheet(
                    onDismiss = {
                        showProjects = false
                    }
                )
            } else {
                MobileProjectsSheet(
                    onDismiss = {
                        showProjects = false
                    }
                )
            }
        }


    }

}


internal expect fun openUrl(url: String?)