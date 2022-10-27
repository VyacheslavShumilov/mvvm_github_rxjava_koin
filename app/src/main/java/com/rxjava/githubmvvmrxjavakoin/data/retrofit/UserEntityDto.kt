package com.rxjava.githubmvvmrxjavakoin.data.retrofit

import com.google.gson.annotations.SerializedName
import com.rxjava.githubmvvmrxjavakoin.domain.entities.UsersEntity

data class UserEntityDto(
    val login: String,
    val id: Long,
    @SerializedName("avatar_url")
    val avatarUrl: String
) {

    fun toUserEntity() = UsersEntity(login, id, avatarUrl)
}
