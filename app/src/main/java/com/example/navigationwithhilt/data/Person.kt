package com.example.navigationwithhilt.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val surname: String,
    val age: Int,
): Parcelable