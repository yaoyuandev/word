package com.example.demo.dict

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface StardictRepository : JpaRepository<Stardict, Int> {


    fun findByWord(word: String): List<Stardict>

}
