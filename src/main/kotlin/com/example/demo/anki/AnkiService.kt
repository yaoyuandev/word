package com.example.demo.anki

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.postForEntity

@Service
class AnkiService {

    val rest = RestTemplate()

    fun decks() = rest.postForEntity<String>(url, Action("deckNames"))

    fun add(front: String, back: String) = add(Note(fields = Fields(front, back), audio = null))

    fun add(note: Note) = rest.postForEntity<String>(
        url,
        Action(
            "addNote",
            Params(
                note
            )
        )
    )

    fun sync() = rest.postForEntity<String>(
        url,
        Action(
            "sync"
        )
    )

    companion object {
        const val url = "http://127.0.0.1:8765"
    }
}
