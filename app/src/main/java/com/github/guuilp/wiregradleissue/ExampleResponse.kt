package com.github.guuilp.wiregradleissue

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExampleResponse(val name: String, val age: Int)