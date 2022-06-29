package com.example.demo.dict

import com.example.demo.anki.Fields
import com.example.demo.anki.Note
import java.io.Serializable

data class StardictDto(
    val word: String,
    val phonetic: String? = null,
    val definition: String? = null,
    val translation: String? = null,
    val exchange: String? = null,
) : Serializable {

    fun toNote() = Note(
        fields = Fields(word, "$phonetic<br>$translation<br/>$definition<br/>$exchange<br>"),
    )
}
