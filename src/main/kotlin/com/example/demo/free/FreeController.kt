package com.example.demo.free

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/free")
class FreeController(val service: FreeService) {

    @GetMapping
    fun query(@RequestParam q: String) = service.query(q)
}
