package com.example.java4qa.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@ConfigurationProperties(prefix = "custom-property")
class WelcomeController {

    @Value("\${userName}")
    lateinit var userName: String

    @RequestMapping("/")
    fun index(model: Model): String {

        model.addAttribute("userName", userName)
        return "welcome"
    }
}
