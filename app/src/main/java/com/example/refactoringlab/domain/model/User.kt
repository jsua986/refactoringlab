package com.example.refactoringlab.domain.model

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val age: Int
)