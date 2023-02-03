package com.example.retrofitproguard

import com.google.gson.annotations.SerializedName

data class Fact(
    @SerializedName("icon_url")
    val icon_url: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("value")
    val value: String
)