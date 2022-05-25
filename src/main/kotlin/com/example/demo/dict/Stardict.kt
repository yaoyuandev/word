package com.example.demo.dict

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

@Entity
@Table(name = "stardict")
open class Stardict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Column(name = "word", nullable = false, length = 256)
    open var word: String = ""

    @Column(name = "sw", length = 256)
    open var sw: String? = null

    @Column(name = "phonetic", length = 1000)
    open var phonetic: String? = null

    @Lob
    @Column(name = "definition")
    open var definition: String? = null

    @Lob
    @Column(name = "translation")
    open var translation: String? = null

    @Column(name = "pos", length = 256)
    open var pos: String? = null

    @Column(name = "collins")
    open var collins: Int? = null

    @Column(name = "oxford")
    open var oxford: Int? = null

    @Column(name = "tag", length = 64)
    open var tag: String? = null

    @Column(name = "bnc")
    open var bnc: Int? = null

    @Column(name = "frq")
    open var frq: Int? = null

    @Lob
    @Column(name = "exchange")
    open var exchange: String? = null

    @Lob
    @Column(name = "detail")
    open var detail: String? = null

    @Lob
    @Column(name = "audio")
    open var audio: String? = null

    fun toDTO() = StardictDto(
        word,
        phonetic,
        definition,
        translation,
        exchange,
    )
}
