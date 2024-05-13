package com.pal.slonapp.ui.theme.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.pal.slonapp.ui.theme.BlurShado40
import com.pal.slonapp.ui.theme.Grey40
import com.pal.slonapp.ui.theme.PurpleGrey40
import com.pal.slonapp.ui.theme.PurpleGrey80
import com.pal.slonapp.ui.theme.model.ServiceBannerModel

@Composable
fun ServiceBannerCard(service: ServiceBannerModel){
    Column {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier
                .weight(0.75f)
                .padding(10.dp)) {
                Text(
                    text = service.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    color = PurpleGrey40
                )
                Text(
                    text = "✯ ${service.ratingNReviews}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Grey40
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "₹ ${service.amountNTime}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Grey40
                )
                Spacer(modifier = Modifier.height(15.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = PurpleGrey40)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = service.description,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Grey40
                )
                Text(
                    text = "Styling Blow dry: Straight",
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Grey40
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "View details",
                    fontSize = 16.sp,
                    color = BlurShado40,
                    fontWeight = FontWeight.Bold,
                )
            }
            Column(modifier = Modifier.weight(0.25f)) {
                Box(modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .padding(2.dp, 2.dp)
                    .background(color = PurpleGrey40, shape = RoundedCornerShape(4.dp))
                ) {
                    Image(
                        painter = rememberImagePainter(service.image),
                        contentDescription = "This is Your Profile Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(80.dp)
                            .height(80.dp)
                            .clip(RoundedCornerShape(10.dp)),
                    )

                }
                Box(modifier = Modifier
                    .padding(20.dp, 1.dp)
                    .border(1.dp, color = Color.Blue, shape = RoundedCornerShape(10.dp))
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(4.dp)
                    )
                ){
                    Text(text = "Add",
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(10.dp,4.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(1.dp)
                .background(color = PurpleGrey80)
        )
    }

}