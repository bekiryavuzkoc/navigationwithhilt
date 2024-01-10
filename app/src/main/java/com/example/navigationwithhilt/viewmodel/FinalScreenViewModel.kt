package com.example.navigationwithhilt.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigationwithhilt.data.Person
import com.example.navigationwithhilt.ui.navigation.InitialScreenArgModule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FinalScreenViewModel @Inject constructor(
    @InitialScreenArgModule.PersonName private val personName: String?,
    @InitialScreenArgModule.PersonData private val personData: Person,
): ViewModel() {

    private val name = personName ?: "Satoshi"
    private val surname = personData.surname

    private val _fullName = MutableStateFlow("$name $surname")
    val fullName = _fullName.asStateFlow()

}
