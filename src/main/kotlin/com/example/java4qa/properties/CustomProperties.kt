package com.example.java4qa.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("custom-properties")
class CustomProperties {

    lateinit var userName: String
    lateinit var lastname: String
}
