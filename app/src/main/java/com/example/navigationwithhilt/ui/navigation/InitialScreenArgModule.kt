package com.example.navigationwithhilt.ui.navigation

import androidx.lifecycle.SavedStateHandle
import com.example.navigationwithhilt.data.Person
import com.example.navigationwithhilt.ui.screen.NAME_ARG
import com.example.navigationwithhilt.ui.screen.PERSON_ARG
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object InitialScreenArgModule {

    @Provides
    @PersonName
    @ViewModelScoped
    fun providePersonName(
        savedStatedHandle: SavedStateHandle,
    ): String? {
        return savedStatedHandle[NAME_ARG]
    }

    @Provides
    @PersonData
    @ViewModelScoped
    fun providePersonData(
        savedStatedHandle: SavedStateHandle,
    ): Person {
        return checkNotNull(savedStatedHandle[PERSON_ARG])
    }

    annotation class PersonName
    annotation class PersonData
}

