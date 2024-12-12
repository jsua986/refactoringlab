package com.example.refactoringlab.data.repository

import com.example.refactoringlab.domain.model.User

object UserRepository {

    private val users = mutableListOf<User>()

    fun saveUser(user: User) {
        users.add(user)
    }

    fun getUserByEmail(email: String): User? {
        return users.find { it.email == email }
    }
}