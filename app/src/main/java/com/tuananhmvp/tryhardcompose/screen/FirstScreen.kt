package com.tuananhmvp.tryhardcompose.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun FirstScreen(modifier: Modifier = Modifier, navHostController: NavHostController) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navHostController.navigate(route = Screen.Detail.route)
            },
            text = "1", style = TextStyle(
                fontWeight = FontWeight(600),
                fontSize = 50.sp,
                color = Color.Red
            )
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FirstScreenPreview() {
    FirstScreen(navHostController = rememberNavController())
}
