package com.pal.slonapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottonNavItem(
    val title :String,
    val route:String,
    val seletedIcon : ImageVector,
    val unseletedIcon : ImageVector,
    val hasNews : Boolean,
    val badges:Int
)

val bottomNavItem = listOf(
    BottonNavItem(
        title = "Home",
        route = "home",
        seletedIcon= Icons.Filled.Home,
        unseletedIcon = Icons.Outlined.Home,
        hasNews = false,
        badges = 0
    ),
    BottonNavItem(
        title = "Search",
        route = "screen",
        seletedIcon= Icons.Filled.Search,
        unseletedIcon = Icons.Outlined.Search,
        hasNews = false,
        badges = 0
    ),
    BottonNavItem(
        title = "Notification",
        route = "notification",
        seletedIcon= Icons.Filled.Notifications,
        unseletedIcon = Icons.Outlined.Notifications,
        hasNews = true,
        badges = 2
    ),
    BottonNavItem(
        title = "Profile",
        route = "signup",
        seletedIcon= Icons.Filled.Person,
        unseletedIcon = Icons.Outlined.Person,
        hasNews = false,
        badges = 0
    ),
    /*profile*/
)