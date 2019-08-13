package com.example.java4qa.controllers

import com.example.java4qa.dto.UserDto
import com.example.java4qa.entity.Role
import com.example.java4qa.entity.User
import com.example.java4qa.repository.RoleRepository
import com.example.java4qa.repository.UserRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/users")
class UserController(private val repository: UserRepository, private val roleRepository: RoleRepository) {

    @GetMapping
    fun findAll(): Iterable<User> {
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Optional<User> {
        return repository.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody userDto: UserDto): User {
        val role: Role = roleRepository.getOne(userDto.roleId)
        val user = User(
                name = userDto.name,
                lastname = userDto.lastname,
                email = userDto.email,
                documentNumber = userDto.documentNumber,
                birthDate = userDto.birthDate,
                information = userDto.information,
                role = role,
                rowCreatedDate = Date()
        )
        return repository.save(user)
    }

}
