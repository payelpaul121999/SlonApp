package com.pal.slonapp.ui.theme.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter

@Composable
fun RowUseAble(){
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "Let's take care \nyour hair",color = Color(0xFF283579), fontSize = 30.sp)
        Image(
            painter = rememberImagePainter("https://img.freepik.com/premium-vector/black-african-american-woman-round-avatar-face-icon-flat-style_768258-2090.jpg"),
            contentDescription = "This is Your Profile Image",
            modifier =
                    Modifier.height(40.dp)
        )
    }
}