package com.im.portfolio.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.dom.ref
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.navigation.Link
import com.varabyte.kobweb.silk.components.graphics.CanvasStyle
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.layout.Divider
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.HTMLElement
import org.w3c.dom.Image

@Page
@Composable
fun HomePage(
    modifier: Modifier = Modifier
) {
//rgba(0, 72, 168, 1)
    Box(
        modifier = modifier.fillMaxSize().backgroundColor(rgba(28, 121, 250, 1)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier.width(1024.px).fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = modifier.fillMaxWidth().fillMaxHeight(10.percent)
            ) {
                Row(
                    modifier = modifier.align(Alignment.CenterStart),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    P(
                        attrs = modifier.color(Colors.White).fontWeight(FontWeight.Bold).toAttrs()
                    ) {
                        Text("IM")
                    }
                }
                Row(
                    modifier = modifier.align(Alignment.CenterEnd),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Link(
                        path = "mailto:ismail1973x@gmail.com"
                    ) {
                        FaEnvelope(
                            modifier = modifier
                                .color(Colors.White)
                                .padding(right = 34.px),
                            style = IconStyle.OUTLINE,
                            size = IconSize.LG
                        )
                    }
                    Link(
                        path = "https://github.com/ismai117"
                    ) {
                        FaGithub(
                            modifier = modifier
                                .color(Colors.White)
                                .padding(right = 34.px),
                            size = IconSize.LG
                        )
                    }
                    Link(
                        path = "https://www.linkedin.com/in/ismailmohamed1/"
                    ) {
                        FaLinkedin(
                            modifier = modifier
                                .color(Colors.White)
                                .attrsModifier {
                                },
                            size = IconSize.LG,
                        )
                    }
                }
            }
            Box(
                modifier = modifier
                    .flexWrap(FlexWrap.Wrap)
                    .fillMaxWidth()
                    .fillMaxHeight(80.percent)
//                    .border(width = 2.px, color = Colors.White, style = LineStyle.Solid)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(380.px)
                        .padding(top = 90.px),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box {
                        Column(
                            modifier = modifier
                                .width(500.px)
                                .height(230.px)
                        ) {
                            Box(
                                modifier = modifier.fillMaxWidth().fillMaxHeight(50.percent),
                                contentAlignment = Alignment.TopStart
                            ) {
                                H1(
                                    attrs = modifier
                                        .color(Colors.White)
                                        .fontSize(64.px)
                                        .fontWeight(FontWeight.Bold)
                                        .toAttrs()
                                ) {
                                    Text("Welcome")
                                }
                            }
                            Row(
                                modifier = modifier.fillMaxWidth().fillMaxHeight(50.percent),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = modifier.padding(right = 12.px)
                                ) {
                                    Divider(
                                        modifier
                                            .backgroundColor(Colors.White)
                                            .width(4.px)
                                            .height(60.px)
                                    )
                                }
                                H3(
                                    attrs = modifier
                                        .color(Colors.White)
                                        .toAttrs()
                                ) {
                                    Text("My name is Ismail Mohamed, and I'm an Android developer based in Liverpool, UK, with 3 years of experience in Android development.")
                                }
                            }
                            var screenElement: HTMLElement? by remember { mutableStateOf(null) }
                            Box(
                                modifier = modifier.padding(top = 12.px)
                            ) {
                                Link(
                                    path = "https://doc-0o-7k-docs.googleusercontent.com/docs/securesc/e5289q5mq4s4novpt9jaa746k75dacjq/kf8cfcjs7a97489hjnctpk2ushb0ac31/1684055325000/16273317108419978502/16273317108419978502/1UWoc9w6UwPvNfFhWkZg5-zoT-Kti8hoS?e=download&ax=ADWCPKBOZxmkLYxMYc9eqmgg2TI9DGUVcwNrqlmP7f_6Lmh29w7TMVffJQu98ktNdqWiEvoYZd_y5VXinO7JqWRVAiSLobJvzjRAwXJ02pTWTo4scqKeKAAIsCNmc9GaRBA-V76LY-AHm6S20tezTsemQjyf68L5RmcwALwyqAL_FYOp1bq0pnXvSKm6lINoZXFex9Uan9BOzurMMdEC5_jQrobRF4QCSM9LtB5fwpFY7Hb5lV8H9hGHwN5istmymSz7zUyHZnbwAWHDfKKViwrKWtv8g1uSxpfx5z318Qv-yrau2NofpI2TgyTWUFoqiDXs3nw0a9Epfs4l7vwdr_g_ie8YztJmpu_n1YROv7WDprgE_oUQ9P6pI0aF9pYsYIU7Mx1ZRZ4vQV-ptPl84gVocIrttAlXkvAi6B9Jypz4PHr_SXzfQhLoI5AfKR1K81hDowF_A8LBDorUnlQJebl4aA7wgf8613O_Q_lI0yRgWn0XwfNpjmB28UIFS_C3S3d4wRL5c-gTTNuaGlNHS0S2YGNY-ANUvgf4KkUDBvBzws6U1G38e6qqMgbVrRIUTPTn00dBljm3emOctEVs2x_DhAcg8qdbNT4mIhqLTgFocvkD_U4vW0pmKFlh5_g8qLxl4sRRk6iluZA5uDrTWEFAgTgh0NH8C6-1xciFKwLXwjZByAU9rKYBwaVTluMw4vhZAeVSvpzxvN3kvsXMs3Qqg-URSyH3TzR6WG8DFcfP2WBiLDWb8NhGpkDEMUysYBXdKPQJox5ONovNA0t1Z32H5KQU6qdJ93dYlSRvyKzzUBD3DBMcJoeqTjzgmSnaOZLGTE3QT--Vx0pAWGh4a1rOVg3ZmX3zZNF0EUjFSKzM3J49KqyiwnS77lnqqrH7cnoV_Jh5PjYFxG2CimSbcjEDPgIi_13DkTNhh9YguOSJz7HTqkvTLqOeGewLdajcUOjK5p9X6_kb2iSG_9sXqffvQlQg6bA2Cdk3raXmpKF7g0JhFw&uuid=a88fdf92-2569-4203-bf0b-7d603689232d&authuser=2&nonce=vrfd4quip14tm&user=16273317108419978502&hash=ec14h18nkbdot1q4kdnkdebboljmet25",
                                ) {
                                    Row(
                                        modifier = modifier.width(188.px).height(40.px).borderRadius(12.px)
                                            .backgroundColor(Colors.White),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        FaDownload(
                                            modifier = modifier.padding(right = 12.px),
                                            size = IconSize.SM
                                        )
                                        Text("Download Resume")
                                    }
                                }
                            }
                        }
                    }
                    Box(
                        modifier = modifier
                            .width(384.px)
                            .height(270.px)
                    ) {
                        Image(
                            src = "contentImg.png",
                            modifier = modifier.fillMaxSize()
                        )
                    }
                }
                Box(
                    modifier = modifier
                        .width(260.px)
                        .height(260.px)
                        .align(Alignment.BottomEnd)
                        .styleModifier {
                            borderRight {
                                width = 23.px
                                color = rgba(0, 72, 168, 1)
                                style = LineStyle.Solid
                            }
                            borderBottom {
                                width = 23.px
                                color = rgba(0, 72, 168, 1)
                                style = LineStyle.Solid
                            }

                        }
                ) {
                    Canvas(
                        attrs = AttrsModifier {
                            this.style {

                            }
                        }.toAttrs()
                    )
                }
                Box(
                    modifier = modifier
                        .align(Alignment.BottomStart)
                        .fontSize(14.px)
                        .color(Colors.White),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text("MADE WITH KOBWEB, KOTLIN, COMPOSE")
                }
            }
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight(10.percent)
            ) {

            }
        }
    }
}

val customStyle by ComponentStyle {
    hover{
        Modifier.color(Colors.Red)
    }
}

// #16161
//
// // background: linear-gradient(97.13deg, #E9E9E9 0%, #515151 100%);6

// background-color: rgba(255, 255, 255, 0);

