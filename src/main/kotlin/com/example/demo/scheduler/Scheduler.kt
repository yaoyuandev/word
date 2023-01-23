package com.example.demo.scheduler

import com.example.demo.anki.AnkiService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Scheduler(val anki: AnkiService) {

    @Scheduled(fixedRate = 30 * 60 * 1000)
    fun sync() {
        log.info("sync : {}", anki.sync())
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(Scheduler::class.java)
    }
}
