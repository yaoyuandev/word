package com.example.demo.anki

import org.springframework.util.DigestUtils

data class Audio(
    val url: String,
    val fields: List<String> = arrayListOf("Front", "Back"),
    val skipHash: String = DigestUtils.md5DigestAsHex(url.byteInputStream())
) {
    val filename = "$skipHash.mp3"
}
