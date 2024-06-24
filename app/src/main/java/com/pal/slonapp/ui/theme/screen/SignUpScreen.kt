package com.pal.slonapp.ui.theme.screen

import android.R.attr.textColor
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Phone
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pal.slonapp.R
import com.pal.slonapp.ui.theme.Purple80


/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController){
    var fullNameText by rememberSaveable { mutableStateOf("Text") }
    Column {
      Spacer(modifier = Modifier.height(28.dp))
        Image(
            painterResource(R.drawable.baseline_arrow_back),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(40.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Create Account", color = Color(0xFF01030E),
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(
                    BorderStroke(2.dp, color = Purple80),
                    shape = RoundedCornerShape(8.dp),
                ),
            value = fullNameText,
            onValueChange = {
                fullNameText = it
            },
            leadingIcon = {
                Icon(Icons.Filled.AccountBox, "", tint = Purple80)
            },
            label = { Text("Full Name") },
            */
/*colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Gray,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )*//*
,

        )
        Spacer(modifier = Modifier.height(14.dp))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(
                    BorderStroke(2.dp, color = Purple80),
                    shape = RoundedCornerShape(8.dp),
                ),
            value = fullNameText,
            onValueChange = {
                fullNameText = it
            },

            leadingIcon = {
                Icon(Icons.Filled.Phone, "", tint = Purple80)
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            label = { Text("Mobile Number") },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor =  Color.Transparent,
            ),

        )
        Spacer(modifier = Modifier.height(14.dp))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(
                    BorderStroke(2.dp, color = Purple80),
                    shape = RoundedCornerShape(8.dp),
                ),
            value = fullNameText,
            onValueChange = {
                fullNameText = it
            },

            leadingIcon = {
                Icon(Icons.Filled.Phone, "", tint = Purple80)
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            singleLine = true,
            label = { Text("Password") },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor =  Color.Transparent,
            ),

            )
        Spacer(modifier = Modifier.height(14.dp))
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(
                    BorderStroke(2.dp, color = Purple80),
                    shape = RoundedCornerShape(8.dp),
                ),
            value = fullNameText,
            onValueChange = {
                fullNameText = it
            },

            leadingIcon = {
                Icon(Icons.Filled.Phone, "", tint = Purple80)
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            singleLine = true,
            label = { Text("Confirm Password") },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor =  Color.Transparent,
            ),

            )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Sign Up",
                fontSize = 14.sp
            )
        }
    }
}*/
