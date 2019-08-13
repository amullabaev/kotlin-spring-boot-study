package com.example.java4qa.repository

import com.example.java4qa.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
