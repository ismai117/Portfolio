package org.ncgroup.portfolio.mobileLayout

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


enum class SkillsTab(val type: String, val index: Int) {
    CoreSkills(type = "Core Skills", index = 0)
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalLayoutApi::class)
@Composable
fun MobileLayout(
    modifier: Modifier = Modifier,
    currentWidth: Dp,
    paddingValues: PaddingValues
) {

    var tabIndex by remember { mutableStateOf(0) }

    val pagerState = rememberPagerState(initialPage = 0) { 2 }

    val scope = rememberCoroutineScope()
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .padding(paddingValues)
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (currentWidth > 650.dp) {
                Box(
                    modifier = modifier
                        .padding(top = 40.dp)
                        .width(650.dp)
                        .height(300.dp),
//                            .border(width = 1.dp, color = MaterialTheme.colorScheme.primary),
                ) {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        Text(
                            text = "Android Developer",
                            fontSize = 14.sp,
                            modifier = modifier
                                .padding(start = 24.dp, end = 24.dp)
                        )

                        Text(
                            text = "Experienced Android developer with 3 years of experience in this field, half of which is commercial. I am deeply passionate about utilising my programming skills to create innovative and impactful products. I also hold a degree in web development from the SAE Institute, where I earned a 2.1. I am eager to bring my expertise and dedication to your team to develop high quality applications that solve complex problems and make a positive impact.",
                            fontSize = 14.sp,
                            modifier = modifier
                                .padding(24.dp)
                        )

                    }

                }

                Box(
                    modifier = modifier
                        .width(650.dp)
                        .height(300.dp),
//                            .border(width = 1.dp, color = MaterialTheme.colorScheme.primary),
                ) {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        TabRow(
                            selectedTabIndex = tabIndex,
                            modifier = modifier
                                .padding(start = 24.dp, end = 24.dp)
                        ) {
                            SkillsTab.entries.forEach {
                                Tab(
                                    text = {
                                        Text(
                                            text = it.type
                                        )
                                    },
                                    selected = tabIndex == it.index,
                                    onClick = {
                                        tabIndex = it.index
                                        scope.launch {
                                            pagerState.animateScrollToPage(it.index)
                                        }
                                    }
                                )
                            }
                        }

                        val techList = listOf(
                            "Kotlin / Jetpack Compose",
                            "Unit Testing",
                            "Work Manager",
                            "Retrofit",
                            "Rest Api",
                            "Dagger-Hilt",
                            "Room",
                            "Firebase",
                            "Realm",
                            "Datastore",
                            "Coil",
                            "Kotlin Multiplatform Mobile",
                            "Ktor",
                            "Koin"
                        )

                        HorizontalPager(
                            state = pagerState,
                            modifier = modifier
                                .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                        ) { page ->
                            when (page) {
                                0 -> {
                                    FlowRow(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        techList.forEach {
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

            } else {
                Box(
                    modifier = modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth()
                        .height(300.dp),
//                            .border(width = 1.dp, color = MaterialTheme.colorScheme.primary),
                ) {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        Text(
                            text = "Android Developer",
                            fontSize = 14.sp,
                            modifier = modifier
                                .padding(start = 24.dp, end = 24.dp)
                        )

                        Text(
                            text = "Experienced Android developer with 3 years of experience in this field, half of which is commercial. I am deeply passionate about utilising my programming skills to create innovative and impactful products. I also hold a degree in web development from the SAE Institute, where I earned a 2.1. I am eager to bring my expertise and dedication to your team to develop high quality applications that solve complex problems and make a positive impact.",
                            fontSize = 14.sp,
                            modifier = modifier
                                .padding(24.dp)
                        )

                    }

                }

                Box(
                    modifier = modifier
                        .padding(bottom = 24.dp)
                        .fillMaxWidth()
                        .height(300.dp),
//                            .border(width = 1.dp, color = MaterialTheme.colorScheme.primary),
                ) {

                    Column(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        TabRow(
                            selectedTabIndex = tabIndex,
                            modifier = modifier
                                .padding(start = 24.dp, end = 24.dp)
                        ) {
                            SkillsTab.entries.forEach {
                                Tab(
                                    text = {
                                        Text(
                                            text = it.type
                                        )
                                    },
                                    selected = tabIndex == it.index,
                                    onClick = {
                                        tabIndex = it.index
                                        scope.launch {
                                            pagerState.animateScrollToPage(it.index)
                                        }
                                    }
                                )
                            }
                        }

                        val techList = listOf(
                            "Kotlin / Jetpack Compose",
                            "Unit Testing",
                            "Work Manager",
                            "Retrofit",
                            "Rest Api",
                            "Dagger-Hilt",
                            "Room",
                            "Firebase",
                            "Realm",
                            "Datastore",
                            "Coil",
                            "Kotlin Multiplatform Mobile",
                            "Ktor",
                            "Koin"
                        )

                        HorizontalPager(
                            state = pagerState,
                            modifier = modifier
                                .padding(top = 12.dp, start = 24.dp, end = 24.dp),
                            userScrollEnabled = false
                        ) { page ->
                            when (page) {
                                0 -> {
                                    FlowRow(
                                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        techList.forEach {
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
    }

}
