package com.example.navigationwithhilt.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.os.bundleOf
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigationwithhilt.data.Person
import com.example.navigationwithhilt.extensions.navigateWithArgs
import com.example.navigationwithhilt.viewmodel.FinalScreenViewModel

internal const val FINAL_ROUTE = "final_route"
internal const val NAME_ARG = "name"
internal const val PERSON_ARG = "person"

internal fun NavController.navigateToFinalScreen(name: String?, person: Person) {
    val args = bundleOf(
        NAME_ARG to name,
        PERSON_ARG to person
    )
    navigateWithArgs(FINAL_ROUTE, args = args)
}

internal fun NavGraphBuilder.finalScreen() {
    composable(route = FINAL_ROUTE) {

        val finalScreenViewModel: FinalScreenViewModel = hiltViewModel()

        val fullName by finalScreenViewModel.fullName.collectAsState()

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = fullName,
            )
        }
    }
}