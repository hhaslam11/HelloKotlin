package com.github.hhaslam11.HelloKotlin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    fun get(): Hello {
        return Hello(1)
    }
}

data class Hello(val id: Long) {
    val name = "Kaleb"
}