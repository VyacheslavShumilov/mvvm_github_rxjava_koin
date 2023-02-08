package com.rxjava.githubmvvmrxjavakoin.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UsersEntity(
    val login: String,
    val id: Long,
    val avatarUrl: String
): Parcelable

data class ProfileEntity(
    val login: String,
    val id: Long,
    val avatarUrl: String
): java.io.Serializable