package com.example.submisisionandroidpemula

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Singer(val images : String, val singer: String, val genre: String, val active: String, val desc : String) : Parcelable {

}
