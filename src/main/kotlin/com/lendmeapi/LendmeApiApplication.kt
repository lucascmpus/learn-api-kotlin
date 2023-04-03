package com.lendmeapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LendmeApiApplication

fun main(args: Array<String>) {
    runApplication<LendmeApiApplication>(*args)
}
