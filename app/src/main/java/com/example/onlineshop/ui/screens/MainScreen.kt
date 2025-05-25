package com.example.onlineshop.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.onlineshop.viewModel.MainViewModel

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val viewModel = remember { MainViewModel() }

    ConstraintLayout(modifier = Modifier.background(Color.White)) {
        val (scrollList, bottomMenu) = createRefs()

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(ref = scrollList) {
                    top.linkTo(anchor = parent.top)
                    bottom.linkTo(anchor = parent.bottom)
                    end.linkTo(anchor = parent.start)
                }
        ) { }
    }

}