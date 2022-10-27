package com.rxjava.githubmvvmrxjavakoin.ui.profile

import androidx.lifecycle.ViewModel
import com.rxjava.githubmvvmrxjavakoin.domain.entities.ProfileEntity
import com.rxjava.githubmvvmrxjavakoin.domain.repos.ProfileRepo
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject

class ProfileViewModel(private val profileRepo: ProfileRepo): ProfileContract.ViewModel, ViewModel() {

    override val profileLiveData: Observable<ProfileEntity> = BehaviorSubject.create()
    override val errorLiveData: Observable<Throwable> = BehaviorSubject.create()
    override val progressLiveData: Observable<Boolean> = BehaviorSubject.create()

    override fun onRefresh() {
        loadData()
    }

    private fun loadData() {
        progressLiveData.onNe
    }
}