package com.example.java4qa.controllers

import com.example.java4qa.properties.CustomProperties
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WelcomeController(private val properties: CustomProperties) {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("userName", properties.userName)
        model.addAttribute("lastname", properties.lastname)
        return "welcome"
    }
}
