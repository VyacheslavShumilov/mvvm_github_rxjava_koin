package com.rxjava.githubmvvmrxjavakoin.domain.repos

import com.rxjava.githubmvvmrxjavakoin.domain.entities.UsersEntity
import io.reactivex.rxjava3.core.Single

interface UsersRepo {

    fun getUsers(): Single<List<UsersEntity>>
}