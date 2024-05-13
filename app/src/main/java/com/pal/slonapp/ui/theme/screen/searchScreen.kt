package com.pal.slonapp.ui.theme.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.pal.slonapp.ui.theme.BlurShado40
import com.pal.slonapp.ui.theme.Grey40
import com.pal.slonapp.ui.theme.Purple80
import com.pal.slonapp.ui.theme.PurpleGrey40
import com.pal.slonapp.ui.theme.PurpleGrey80
import com.pal.slonapp.ui.theme.card.CategoryTab
import com.pal.slonapp.ui.theme.card.ServiceBannerCard
import com.pal.slonapp.ui.theme.data.getMenuModels
import com.pal.slonapp.ui.theme.data.getSeviceBannerStaticData


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController){
    val imagelList = getSeviceBannerStaticData()
    var text by rememberSaveable { mutableStateOf("Text") }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(
                    BorderStroke(2.dp, color = Purple80),
                    shape = RoundedCornerShape(8.dp),
                ),
            value = text,
            onValueChange = {
                text = it
            },
            trailingIcon = {
                Icon(Icons.Filled.Search, "", tint = Purple80)
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor =  Color.Transparent,
            )
            /*label = { Text("Label") }*/
        )
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn {
            items(imagelList) { menuModel ->
                ServiceBannerCard(menuModel)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            navController.navigate("profile")
        }) {
            Text(text = "Go to Next",
                fontSize = 14.sp
            )
        }
    }
}

