package com.example.fashionapp.screens

import android.service.controls.Control
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fashionapp.R
import com.example.fashionapp.Screen

@Composable
fun LandingScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.front) ,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
          Row(
              modifier = Modifier
                  .background(
                      color = Color.White.copy(alpha = 0.5f),
                      shape = RoundedCornerShape(16.dp)
                  )
                  .padding(7.dp)
                  .wrapContentWidth()
          ) {
             Icon(
                 painter = painterResource(id = R.drawable.ic_menu),
                 contentDescription = null,
                 modifier = Modifier.size(20.dp)
             )
              Text(
                  text = "Menu",
                  fontSize = 15.sp,
                  modifier = Modifier
                      .padding(start = 4.dp)
                      .wrapContentWidth()
                  )
          }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomEnd)
                .clickable { navController.navigate(Screen.Dashboard.router) }
        ){
          Row(
              modifier = Modifier
                  .background(
                      color = Color.Yellow,
                      shape = RoundedCornerShape(
                          topStart = 24.dp,
                          topEnd = 24.dp
                      )
                  )
                  .padding(12.dp)
                  .fillMaxWidth(),
              horizontalArrangement = Arrangement.Center,
              verticalAlignment = Alignment.CenterVertically
          ){
          Text(
              text = "Get Started",
              fontSize = 16.sp,
              fontWeight = FontWeight.Bold,
              modifier = Modifier.wrapContentWidth()
          )
              Icon(
                  painter = painterResource(id = R.drawable.ic_next),
                  contentDescription = null,
                  modifier = Modifier.size(32.dp)
                  )
          }
        }
    }
}

@Preview
@Composable
fun LandingScreenPreview() {
    LandingScreen(navController = rememberNavController())
}