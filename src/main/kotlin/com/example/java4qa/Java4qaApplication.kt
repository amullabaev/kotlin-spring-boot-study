package com.example.java4qa

import com.example.java4qa.properties.CustomProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(CustomProperties::class)
class Java4qaApplication

fun main(args: Array<String>) {
    runApplication<Java4qaApplication>(*args)
}
