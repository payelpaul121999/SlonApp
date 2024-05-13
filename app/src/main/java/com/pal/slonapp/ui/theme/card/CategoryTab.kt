package com.pal.slonapp.ui.theme.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter

@Composable
fun CategoryTab(resourceId:String,menuName:String){

      Box(modifier = Modifier
          .padding(5.dp)
          .background(color = Color(0xFFDDB477), shape = RoundedCornerShape(10.dp)),
      ) {
          Column(modifier = Modifier
              .padding(12.dp,18.dp),
              horizontalAlignment = Alignment.CenterHorizontally,
              verticalArrangement = Arrangement.Center,

              ) {
              Image(
                  painter = rememberImagePainter(resourceId),
                  contentDescription = null,
                  modifier = Modifier
                      .size(25.dp)
              )
              Text(
                  text = "$menuName",
                  color = Color.Black,
                  fontSize = 12.sp, // Adjust font size as needed
                  fontWeight = FontWeight.Normal, // Adjust font weight as needed
                  modifier = Modifier
              )
          }
      }

}