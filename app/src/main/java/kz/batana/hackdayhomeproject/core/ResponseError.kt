package kz.batana.hackdayhomeproject.core

import com.google.gson.annotations.SerializedName

data class ResponseError(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String
)