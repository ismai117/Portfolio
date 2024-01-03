package org.ncgroup.portfolio.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.ncgroup.portfolio.openUrl
import org.ncgroup.portfolio.theme.LocalThemeIsDark



@Composable
fun MobileTopAppBar(
    modifier: Modifier = Modifier,
    openProjects: () -> Unit
) {
    var isDark by LocalThemeIsDark.current

    Column(
        modifier = modifier.padding(24.dp)
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
//                                .border(width = 1.dp, color = Color.White),
        ) {
            Text(
                text = "Ismail Mohamed",
                modifier = modifier
                    .align(Alignment.CenterStart)
//                                    .border(width = 1.dp, color = Color.White),
            )
            IconButton(
                onClick = { isDark = !isDark },
                modifier = modifier
                    .size(24.dp)
                    .align(Alignment.CenterEnd)
//                                    .border(width = 1.dp, color = Color.White),
            ) {
                Icon(
                    imageVector = if (isDark) Icons.Default.LightMode else Icons.Default.DarkMode,
                    contentDescription = null
                )
            }
        }
        Row(
            modifier = modifier
                .padding(top = 12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            TextButton(
                onClick = {
                          openProjects()
                },
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "Projects"
                )
            }
            Spacer(modifier = modifier.padding(12.dp))
            TextButton(
                onClick = {
                    openUrl("https://drive.google.com/uc?export=download&id=1V5bfO1LaCp9SR5hw6v3u-m--RVSAZkQW")
                },
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "Resume"
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NonMobileTopAppBar(
    modifier: Modifier = Modifier,
    openProjects: () -> Unit
) {

    var isDark by LocalThemeIsDark.current

    TopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Ismail Mohamed"
                )
                IconButton(
                    onClick = { isDark = !isDark }
                ) {
                    Icon(
                        modifier = Modifier.padding(8.dp).size(20.dp),
                        imageVector = if (isDark) Icons.Default.LightMode else Icons.Default.DarkMode,
                        contentDescription = null
                    )
                }
            }
        },
        actions = {
            TextButton(
                onClick = {
                    openProjects()
                },
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "Projects"
                )
            }
            Spacer(modifier = modifier.padding(12.dp))
            TextButton(
                onClick = {
                    openUrl("https://drive.google.com/uc?export=download&id=1V5bfO1LaCp9SR5hw6v3u-m--RVSAZkQW")
                },
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "Resume"
                )
            }
        }
    )
}