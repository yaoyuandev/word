package com.example.demo

import com.example.demo.anki.AnkiService
import com.example.demo.dict.StardictDto
import com.example.demo.dict.StardictRepository
import com.example.demo.free.FreeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController
class IndexController(val repo: StardictRepository, val anki: AnkiService, val free: FreeService) {

    @GetMapping
    fun query(
        @RequestParam q: String,
        @RequestParam(defaultValue = "false") save: Boolean,
    ): StardictDto {
        val dto = repo.findByWord(q.trim().lowercase()).first().toDTO()
        if (save) {
            val note = dto.toNote()
            println("note=$note")
            anki.add(note)
        }
        return dto
    }

    @GetMapping("/save")
    fun save(@RequestParam word: String): ResponseEntity<String> {
        val stardictDto = repo.findByWord(word).first().toDTO()
        val note = stardictDto.toNote()
        println("note=$note")
        return anki.add(note)
    }

    @GetMapping("/say")
    fun say(@RequestParam word: String) {
        Runtime.getRuntime().exec("say $word")
    }
}
