package org.ncgroup.portfolio.mobileLayout

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.resource
import org.ncgroup.portfolio.nonMobileLayout.Projects


data class Projects(
    val title: String,
    val subtitle: String,
    val date: String,
    val description: String,
    val image: Resource,
    val technologies: List<String>
)


@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun MobileProjectsSheet(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit
){

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )

    ModalBottomSheet(
        onDismissRequest = { onDismiss() },
        modifier = modifier
            .fillMaxSize()
            .padding(top = 24.dp),
        sheetState = sheetState,
        windowInsets = WindowInsets(0.dp)
    ){
        Column {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Projects"
                    )
                },
//                modifier = modifier.border(width = 1.dp, color = Color.Black),
                windowInsets = WindowInsets(0.dp)
            )
            LazyColumn(
//                modifier = modifier.border(width = 1.dp, color = Color.Black),
                contentPadding = PaddingValues(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(
                    items = listOf(
                        Projects(
                            title = "CTR Group UK",
                            subtitle = "Lead Developer",
                            date = "March 2022 - July 2023",
                            description = "Developed the company's new driver app from scratch using Kotlin as the main language and the latest tools and technologies in Android development, making the process much smoother and quicker for the drivers than the old app, which was built using flutter.",
                            image = resource("ctrlogo.png"),
                            technologies = listOf(
                                "Kotlin",
                                "Jetpack Compose",
                                "Work Manager",
                                "Room Database",
                                "Retrofit",
                                "Coil",
                                "Google Maps",
                                "More"
                            )
                        ),
                        Projects(
                            title = "Portfolio",
                            subtitle = "Current",
                            date = "",
                            description = "Built with kotlin Multiplatform, this application works on Android, Ios, Desktop and Web.",
                            image = resource(""),
                            technologies = listOf(
                                "Kotlin Multiplatform",
                                "Jetpack Compose",
                            )
                        )
                    )
                ) { item ->
                    ElevatedCard(
                        modifier = modifier
                            .fillMaxWidth()
                            .wrapContentSize()
                    ) {
                        Column(
                            modifier = modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Row {
                                if (item.subtitle.isNotBlank()){
                                    Text("${item.title} - ${item.subtitle}")
                                }else{
                                    Text(item.title)
                                }
                            }
                            if (item.date.isNotBlank()){
                                Text(item.date)
                            }
                            if (item.description.isNotBlank()){
                                Text(item.description)
                            }
                            FlowRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                item.technologies.forEach {
                                    ElevatedSuggestionChip(
                                        onClick = {},
                                        label = {
                                            Text(
                                                text = it
                                            )
                                        },
                                        enabled = false
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
