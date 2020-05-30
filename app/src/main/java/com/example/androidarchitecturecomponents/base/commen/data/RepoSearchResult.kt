package com.example.androidarchitecturecomponents.base.commen.data

import androidx.room.Entity

@Entity(primaryKeys = ["query"])

data class RepoSearchResult(
    val query: String,
    val repoIds: List<Int>,
    val totalCount: Int,
    val next: Int?
)
