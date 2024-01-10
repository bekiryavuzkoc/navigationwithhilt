package com.example.navigationwithhilt.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationwithhilt.data.Person

internal const val INITIAL_ROUTE = "initial_route"

internal fun NavGraphBuilder.initialScreen(
    onNavigateButtonClicked: (String?, Person) -> Unit,
) {
    composable(route = INITIAL_ROUTE) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                onNavigateButtonClicked(null, Person("Nakamoto", 15))
            }) {
                Text("Navigate to Final Screen")
            }
        }
    }
}