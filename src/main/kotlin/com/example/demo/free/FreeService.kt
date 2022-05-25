package com.example.demo.free

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity

@Service
class FreeService {

    val rest = RestTemplate()

    fun query(word: String) = rest.getForEntity<Entrys>("https://api.dictionaryapi.dev/api/v2/entries/en/$word")
}
