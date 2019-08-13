package com.example.java4qa.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String,
        var lastname: String,
        var email: String,
        var documentNumber: String,
        var birthDate: Date,
        var information: String?,
        var rowCreatedDate: Date,

        @ManyToOne
        @JoinColumn(name = "role_id")
        var role: Role
)
