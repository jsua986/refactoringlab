package com.example.refactoringlab

import com.example.refactoringlab.data.repository.EmailService
import com.example.refactoringlab.data.repository.UserRepository
import com.example.refactoringlab.domain.model.User
import com.example.refactoringlab.data.repository.UserValidator

class UserManager {
    fun registerUser(
        firstName: String,
        lastName: String,
        email: String,
        password: String,
        age: Int,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        UserValidator.validateUserRegistration(firstName,lastName,email,password,age,onError)
        // Save user to database
        val user = User(firstName, lastName, email, password, age)
        UserRepository.saveUser(user)
        // Send welcome email
        EmailService.sendWelcomeEmail(email)
        onSuccess()
    }


}
