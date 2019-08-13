package com.example.java4qa.repository

import com.example.java4qa.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository: JpaRepository<Role, Long> {
}
