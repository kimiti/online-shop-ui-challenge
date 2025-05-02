package com.example.onlineshop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onlineshop.R

@Preview
@Composable
fun IntroScreen(onClick: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.intro_pic),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 48.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = stringResource(R.string.title),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = stringResource(R.string.subTitle),
            color = Color.DarkGray,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 16.dp)
        )
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .padding(horizontal = 32.dp, vertical = 16.dp)
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.blue)),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                text = stringResource(R.string.start),
                color = Color.White,
                fontSize = 18.sp
            )
        }
        Text(
            text = stringResource(R.string.signIn),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 16.dp)
        )
    }

}