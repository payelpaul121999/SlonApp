package com.pal.slonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pal.slonapp.navigation.bottomNavItem
import com.pal.slonapp.ui.theme.SlonAppTheme
import com.pal.slonapp.ui.theme.screen.HomeScreen
import com.pal.slonapp.ui.theme.screen.NotificationScreen
import com.pal.slonapp.ui.theme.screen.ProfileScreen
import com.pal.slonapp.ui.theme.screen.SearchScreen
/*import com.pal.slonapp.ui.theme.screen.SignUpScreen*/

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SlonAppTheme {
                // A surface container using the 'background' color from the theme
                val navControll = rememberNavController()
                var seleted by remember {
                    mutableIntStateOf(0)
                }
                Scaffold(
                    topBar = {

                    },
                    bottomBar = {
                    NavigationBar {
                        bottomNavItem.forEachIndexed { index, bottonNavItem ->
                            NavigationBarItem(
                                selected = index==seleted,
                                onClick = {
                                        seleted = index
                                        navControll.navigate(bottonNavItem.route){
                                            /* Pop up to the start destination of the graph to
                                            avoid building up a large stack of destinations
                                             on the back stack as users select items*/
                                            popUpTo(navControll.graph.findStartDestination().id) {
                                                saveState = true
                                            }
                                           /*  Avoid multiple copies of the same destination when
                                             reselecting the same item*/
                                            launchSingleTop = true
                                            /*Restore state when reselecting a previously selected item*/
                                            restoreState = true
                                        }
                                         },
                                icon = {
                                    BadgedBox(badge = {
                                        if (bottonNavItem.badges != 0) {
                                            Badge{
                                                Text(text = bottonNavItem.badges.toString())
                                            }
                                        }else if(bottonNavItem.hasNews){
                                            Badge()
                                        }
                                    }) {
                                     Icon(imageVector =
                                     if(index==seleted)
                                        bottonNavItem.seletedIcon
                                     else
                                         bottonNavItem.unseletedIcon
                                         , contentDescription = bottonNavItem.title)
                                    }
                                },
                                label = {
                                    bottonNavItem.title
                                }
                                )
                        }
                    }
                    }
                ) {
                    val padding = it
                    NavHost(navController = navControll, startDestination ="home" ){
                        composable("home"){
                            HomeScreen(navController = navControll)
                        }
                        composable("signup"){
                            //SignUpScreen(navController = navControll)
                        }
                        composable("screen"){
                            SearchScreen(navController = navControll)
                        }
                        composable("notification"){
                            NotificationScreen(navController = navControll)
                        }
                        composable("profile"){
                            ProfileScreen(navController = navControll)
                        }
                    }
                }
            }
        }
    }
}


