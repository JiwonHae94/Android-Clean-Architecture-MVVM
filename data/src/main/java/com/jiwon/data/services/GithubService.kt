package com.jiwon.data.services

import com.jiwon.data.repo.GithubRepoRes

interface GithubService {
    suspend fun getRepos(
        owner :  String
    ) : List<GithubRepoRes>
}