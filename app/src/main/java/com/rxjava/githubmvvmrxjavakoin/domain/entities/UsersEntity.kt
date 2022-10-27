package com.rxjava.githubmvvmrxjavakoin.domain.entities

import com.google.gson.annotations.SerializedName

data class UsersEntity(
    val login: String,
    val id: Long,
    @SerializedName("avatar_url")
    val avatarUrl: String
)