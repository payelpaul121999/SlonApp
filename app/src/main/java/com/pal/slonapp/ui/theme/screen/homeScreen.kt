package com.pal.slonapp.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pal.slonapp.R
import com.pal.slonapp.ui.theme.card.CategoryTab
import com.pal.slonapp.ui.theme.card.RowUseAble
import com.pal.slonapp.ui.theme.card.ServiceCard
import com.pal.slonapp.ui.theme.card.SpecialistCard
import com.pal.slonapp.ui.theme.card.TwoRowTextCard
import com.pal.slonapp.ui.theme.data.getMenuModels
import com.pal.slonapp.ui.theme.data.getServiceModelStaticData
import com.pal.slonapp.ui.theme.data.getSpecialistData


@Composable
fun HomeScreen(navController: NavController){
    val imagelList = getMenuModels()
    val serviceList = getServiceModelStaticData()
    val personList = getSpecialistData()
Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()
        )
        .padding(20.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    /*verticalArrangement = Arrangement.Top*/
) {
    Row(modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painterResource(R.drawable.baseline_view),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(40.dp)
        )
        Row {
            Image(
                painterResource(R.drawable.ic_location),
                contentDescription = "This is location",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(18.dp)
            )
            Text(
                text = "Howrah",
                color =Color(0xFF283579),
            )
        }
    }
    Spacer(modifier = Modifier.height(40.dp))
    RowUseAble()
    Spacer(modifier = Modifier.height(40.dp))
    TwoRowTextCard("Category","View All")
    Spacer(modifier = Modifier.height(4.dp))
    LazyRow {
        items(imagelList) { menuModel ->
            CategoryTab(menuModel.img,menuModel.name)
        }
    }
    Spacer(modifier = Modifier.height(20.dp))
    TwoRowTextCard("Recommended","View All")
    Spacer(modifier = Modifier.height(20.dp))
    LazyRow {
        items(serviceList) { menuModel ->
            ServiceCard(menuModel)
        }
    }
    Spacer(modifier = Modifier.height(20.dp))
    TwoRowTextCard("Top Specialist","View All")
    Spacer(modifier = Modifier.height(20.dp))
    LazyRow {
        items(personList) { menuModel ->
            SpecialistCard(menuModel)
        }
    }
    Spacer(modifier = Modifier.height(40.dp))
    Text(text = "Home Screen",
    fontSize = 14.sp
    )
   Spacer(modifier = Modifier.height(10.dp))
    Button(onClick = {
       navController.navigate("screen")
    }) {
        Text(text = "Go to Next",
            fontSize = 14.sp
        )
    }
}
}

