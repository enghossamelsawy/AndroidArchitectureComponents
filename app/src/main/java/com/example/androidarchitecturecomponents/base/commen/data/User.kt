package com.example.androidarchitecturecomponents.base.commen.data


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["login"])
data class User(
    @field:SerializedName("avatar_url")
    val avatarUrl: String,
    @field:SerializedName("gravatar_id")
    val gravatarId: String,
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("login")
    val login: String,
    @field:SerializedName("organizations_url")
    val organizationsUrl: String,
    @field:SerializedName("repos_url")
    val reposUrl: String,
    @field:SerializedName("url")
    val url: String
)