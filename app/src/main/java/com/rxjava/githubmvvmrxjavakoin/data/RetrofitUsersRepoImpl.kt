package com.rxjava.githubmvvmrxjavakoin.data

import com.rxjava.githubmvvmrxjavakoin.data.retrofit.GithubApi
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitUsersRepoImpl : UsersRepo {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create()) //RxJava3 Adapter
        .build()
    private val api: GithubApi = retrofit.create(GithubApi::class.java)


    // 2022.10.24 с RxJava
    override fun getUsers(onSuccess: (List<UsersEntity>) -> Unit, onError: ((Throwable) -> Unit)?) {

        api.getUsers().subscribeBy(
            onSuccess = {
                onSuccess.invoke(it)
            },
            onError = {
                onError?.invoke(it)
            }
        )
    }

    override fun getUsers(): Single<List<UsersEntity>> = api.getUsers()

}