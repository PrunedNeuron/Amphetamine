package dev.jahir.blueprint.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LithiumResponse(val status: String? = null, val message: String? = null) : Parcelable