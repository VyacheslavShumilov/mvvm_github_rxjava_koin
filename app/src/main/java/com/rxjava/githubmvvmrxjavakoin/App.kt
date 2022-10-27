package com.rxjava.githubmvvmrxjavakoin

import android.app.Application
import android.content.Context
import com.rxjava.githubmvvmrxjavakoin.data.RetrofitUsersRepoImpl
import com.rxjava.githubmvvmrxjavakoin.domain.repos.UsersRepo

class App: Application() {
    val usersRepo: UsersRepo by lazy { RetrofitUsersRepoImpl() }}

val Context.app: App get() = applicationContext as App