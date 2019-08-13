package com.example.java4qa.dto

import java.util.*

data class UserDto(
        var name: String,
        var lastname: String,
        var email: String,
        var documentNumber: String,
        var birthDate: Date,
        var information: String,
        var roleId: Long
)
