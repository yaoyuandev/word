package com.example.demo.free

class Entrys : ArrayList<Entry>() {

    fun audio(): String? {
        for (entry in this) {
            for (p in entry.phonetics) {
                if (!p.audio.isNullOrEmpty()) {
                    return p.audio
                }
            }
        }
        return null
    }
}
