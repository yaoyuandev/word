package com.example.demo.anki

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Action(
    val action: String,
    val params: Params? = null
)
