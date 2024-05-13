package com.pal.slonapp.ui.theme.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TwoRowTextCard(type:String,seeAll:String){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {

        Text(
            text = type,
            color = Color(0xFF283579),
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = seeAll,
            color = Color(0xFF283579),
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold
        )
    }
}