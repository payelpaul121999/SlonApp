package com.pal.slonapp.ui.theme.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.pal.slonapp.ui.theme.model.PersonModel

@Composable
fun SpecialistCard(person: PersonModel){
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )        {
        Image(
            painter = rememberImagePainter(person.image),
            contentDescription = "This is Your Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(70.dp).width(70.dp).clip(CircleShape)
        )
        Text(text = person.name,color = Color(0xFF283579), fontSize = 14.sp)
    }
}