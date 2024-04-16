package com.dicoding.picodiploma.mycamera.data.api

import com.google.gson.annotations.SerializedName

data class FileUploadResponse (

	@field:SerializedName("data")
	val data: Data = Data(),

	@field:SerializedName("message")
	val message: String? = null
)

data class Data(

	@field:SerializedName("result")
	val result: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("confidenceScore")
	val confidenceScore: Double? = null,

	@field:SerializedName("isAboveThreshold")
	val isAboveThreshold: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null
)
