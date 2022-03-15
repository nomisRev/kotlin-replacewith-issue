package io.github.nomisrev

import io.github.nomisrev.origin.example
import arrow.core.right
import io.github.nomisrev.origin.either

suspend fun main() {
    example { 1 }

    either.eager<String, Int> {
        1.right().bind()
    }

//    either<String, Int> {
//        1.right().bind()
//    }
}