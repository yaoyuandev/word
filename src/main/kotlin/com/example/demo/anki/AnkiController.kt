package com.example.demo.anki

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/anki")
class AnkiController(val service: AnkiService) {

    @GetMapping("/decks")
    fun decks() = service.decks()

    @GetMapping("/add")
    fun add(@RequestParam f: String, @RequestParam b: String) = service.add(f, b)
}
