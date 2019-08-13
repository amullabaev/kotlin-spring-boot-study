package com.example.java4qa.entity

import javax.persistence.*

@Entity
@Table(name = "roles")
data class Role (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String
)
