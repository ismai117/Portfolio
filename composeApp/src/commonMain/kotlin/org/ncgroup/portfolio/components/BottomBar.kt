package org.ncgroup.portfolio.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import compose.icons.FeatherIcons
import compose.icons.feathericons.Github
import compose.icons.feathericons.Linkedin
import org.ncgroup.portfolio.openUrl


@Composable
fun BottomBar(){
    BottomAppBar(
        actions = {
            IconButton(
                onClick = {
                    openUrl("https://github.com/ismai117?tab=repositories")
                }
            ) {
                Icon(
                    imageVector = FeatherIcons.Github,
                    contentDescription = ""
                )
            }
            IconButton(
                onClick = {
                    openUrl("https://www.linkedin.com/in/ismailmohamed1/")
                }
            ) {
                Icon(
                    imageVector = FeatherIcons.Linkedin,
                    contentDescription = ""
                )
            }
        },
        containerColor = Color.Transparent
    )
}