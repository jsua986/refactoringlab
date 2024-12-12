package com.example.refactoringlab.data.repository

object UserValidator {

    fun validateUserRegistration(
        firstName: String,
        lastName: String,
        email: String,
        password: String,
        age: Int,
        onError: (String) -> Unit
    ){
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            onError("All fields must be filled")
            return
        }
        if (!email.contains("@")) {
            onError("Invalid email address")
            return
        }
        if (password.length < 6) {
            onError("Password must be at least 6 characters")
            return
        }
        if (age < 18) {
            onError("User must be at least 18 years old")
            return
        }

    }

}