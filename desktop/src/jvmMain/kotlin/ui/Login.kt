package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abhiram.common.Purple40

@Composable
fun Login() {

    Box(
        modifier = Modifier
            .fillMaxHeight(1F)
            .fillMaxHeight(1F),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .align(Alignment.Center)
        ){
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .height(20.dp),
                text = "Login"
            )
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .height(20.dp),
                text = "Login"
            )
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .height(20.dp),
                text = "Login"
            )
        }
    }
}