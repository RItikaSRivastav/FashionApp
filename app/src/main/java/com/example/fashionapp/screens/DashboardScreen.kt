package com.example.fashionapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fashionapp.R
import com.example.fashionapp.Screen

@Composable
fun DashboardScreen(navController: NavController) {
    val searchState = remember { mutableStateOf("") }
    Box{
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .zIndex(2.0f)
       ) {
        Text(
            text = "Basics But\n Never Basic",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp, bottom = 24.dp)
        )
           Row(
               modifier = Modifier
                   .padding(start = 24.dp, end = 24.dp)
                   .fillMaxWidth()
                   .height(48.dp)
                   .background(
                       color = Color.White,
                       shape = RoundedCornerShape(48.dp)
                   )
                   .border(
                       width = 1.dp,
                       color = Color.LightGray,
                       shape = RoundedCornerShape(45.dp)
                   ),
               verticalAlignment = Alignment.CenterVertically
           ) {
          BasicTextField(
              value = searchState.value,
              onValueChange = {searchState.value = it },
              modifier = Modifier
                  .fillMaxHeight()
                  .weight(1f)
                  .wrapContentHeight()
                  .padding(start = 16.dp),
             singleLine = true,
              decorationBox = { innerTextField ->
                  if (searchState.value.isEmpty()) {
                      Text(
                          text = "Search..",
                          color = Color.Gray,
                          modifier = Modifier
                              .weight(1f)
                              .wrapContentHeight()
                      )
                  } else {
                      innerTextField()
                  }
              }
          )
               Image(
                   painter = painterResource(id = R.drawable.ic_search),
                   contentDescription = null,
                   modifier = Modifier
                       .padding(end = 6.dp)
                       .size(36.dp)
                       .background(
                           color = Color(android.graphics.Color.parseColor("#509790")),
                           shape = RoundedCornerShape(21.dp)
                       )
                       .padding(6.dp),
                    colorFilter = ColorFilter.tint(Color.White)
               )
           }
       }
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .weight(1f)
                    .offset(y = (-24).dp)
                    .zIndex(1f)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(android.graphics.Color.parseColor("#CBEBF7")),
                                Color(android.graphics.Color.parseColor("#F9F7F6"))
                            )
                        )
                    )
                    .padding(start = 10.dp)
            ) {
                item {
                    ProductView(
                        image = R.drawable.card_1,
                        name = "Crop Top",
                        price = 12.88f ,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController
                        )
                }
                item {
                    ProductView(
                        image = R.drawable.card_4,
                        name = "Summer Dress",
                        price = 13.78f ,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController
                    )
                }
                item {
                    ProductView(
                        image = R.drawable.card_5,
                        name = "Trandy Tops",
                        price = 16.58f ,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController
                    )
                }
                item {
                    ProductView(
                        image = R.drawable.card_9,
                        name = "Maxi",
                        price = 9.18f ,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController
                    )
                }
                item {
                    ProductView(
                        image = R.drawable.card_8,
                        name = "EthicWear",
                        price = 18.98f ,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController
                    )
                }
                item {
                    ProductView(
                        image = R.drawable.card_6,
                        name = "Sheath Dress",
                        price = 14.58f ,
                        modifier = Modifier.padding(end = 16.dp, top = 40.dp),
                        navController = navController
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStart = 16.dp, topEnd = 16.dp
                    )
                )
                .padding(top = 8.dp, bottom = 8.dp)
                .align(Alignment.BottomCenter)
        ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
       Icon(
           imageVector = Icons.Outlined.AccountCircle,
           contentDescription = null,
           modifier = Modifier.size(30.dp)
       )
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Icon(
                imageVector = Icons.Outlined.AddCircle,
                contentDescription = null,
                modifier = Modifier.size(30.dp),
                tint = Color(android.graphics.Color.parseColor("#509790"))
            )
            Icon(
                imageVector = Icons.Outlined.FavoriteBorder,
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }
        }

    }
}

@Composable
fun ProductView(
  image : Int,
  name: String,
  price: Float,
  modifier: Modifier,
  navController: NavController,
  ) {
   ElevatedCard(
       modifier = modifier.clickable(
           interactionSource = remember {
               MutableInteractionSource()
           },
           indication = null
       ) {
           navController.navigate(Screen.Product.router)
       },
       elevation = CardDefaults.cardElevation(
           defaultElevation = 2.dp
       ),
       shape = RoundedCornerShape(
           topStart = 110.dp,
           topEnd = 110.dp,
           bottomStart = 8.dp,
           bottomEnd = 8.dp
       ),
       colors = CardDefaults.cardColors(containerColor = Color.White)
   ) {
       Column {
           Image(
               painter = painterResource(id = image) ,
               contentDescription = null,
               modifier = Modifier
                   .padding(7.dp)
                   .clip(
                       shape = RoundedCornerShape(
                           topStart = 110.dp,
                           topEnd = 110.dp
                       )
                   )
           )
           Text(
               text = name,
               modifier = Modifier.fillMaxWidth(),
             textAlign = TextAlign.Center
           )
           Text(
               text = "$$price",
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(top = 4.dp, bottom = 8.dp),
                textAlign = TextAlign.Center,
               fontWeight = FontWeight.Bold
           )
       }
   }
}

@Preview
@Composable
fun  DashboardScreenPreview() {
    DashboardScreen(navController = rememberNavController())
}