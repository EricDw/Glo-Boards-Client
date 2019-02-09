package com.example.glodroid.dtos

data class BoardCreationSuccessDTO(
    val created_by: CreatedByDTO,
    val created_date: String,
    val id: String,
    val name: String
)