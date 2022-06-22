package com.jiwon.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jiwon.domain.data.GithubRepo
import com.jiwon.domain.usecases.GetGithubRepoUseCase

class MainViewModel constructor(
    private val getGithubRepoUseCase: GetGithubRepoUseCase
) : ViewModel() {
    private val _githubRepositories = MutableLiveData<List<GithubRepo>>()
    val githubRepositories : LiveData<List<GithubRepo>> = _githubRepositories

    fun getGithubRepositories(owner : String) {
        getGithubRepoUseCase(owner, viewModelScope){ repositories ->
            _githubRepositories.value = repositories
        }
    }
}