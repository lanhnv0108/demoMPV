package com.example.recyclerview.model

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Model(val title: String, val des: String, val image: Int) : Parcelable{

}