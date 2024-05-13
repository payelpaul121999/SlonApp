package com.pal.slonapp.ui.theme.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.pal.slonapp.R
import com.pal.slonapp.ui.theme.model.ServiceModel

@Composable
fun ServiceCard(serviceModel: ServiceModel){
    Box(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth()
        .background(color = Color(0xFF283579), shape = RoundedCornerShape(10.dp)),
    ) {
        Column(modifier = Modifier.padding(5.dp)) {
            Box(
                modifier = Modifier
                    .height(130.dp)
                    .padding(2.dp)
                    .background(color = Color(0xFF283579), shape = RoundedCornerShape(10.dp)),
            ) {
                Image(
                    painter = rememberImagePainter(serviceModel.image),
                    contentDescription = "This is service card",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .height(130.dp)
                        .width(240.dp)

                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = serviceModel.title,
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(50.dp))
                Row ( horizontalArrangement = Arrangement.SpaceAround){
                    Text(
                        text = serviceModel.rating,
                        color = Color.White,
                    )
                    Image(
                        painterResource(R.drawable.baseline_star_rate),
                        contentDescription = "This is rating",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.height(18.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}