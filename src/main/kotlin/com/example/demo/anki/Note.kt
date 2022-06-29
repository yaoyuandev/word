package com.example.demo.anki

data class Note(
    val deckName: String = "Default",
    val modelName: String = "Basic",
    val fields: Fields
)
