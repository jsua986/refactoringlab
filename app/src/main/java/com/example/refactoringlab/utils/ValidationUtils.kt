package com.example.refactoringlab.utils

import com.example.refactoringlab.data.repository.UserRepository

class ValidationUtils {

    fun authenticateUser(
        email: String,
        password: String,
        onResult: (Boolean) -> Unit
    ) {
        val user = UserRepository.getUserByEmail(email)
        if (user == null) {
            onResult(false)
            return
        }
        onResult(user.password == password)
    }

}