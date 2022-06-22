package com.jiwon.data.datasource

import com.jiwon.data.repo.GithubRepoRes
import com.jiwon.data.services.GithubService

interface GithubRemoteSource{
    suspend fun getRepos(owner : String) : List<GithubRepoRes>
}

class GithubRemoteSourceImple(
    private val githubService : GithubService
) : GithubRemoteSource {
    override suspend fun getRepos(owner: String): List<GithubRepoRes> {
        return githubService.getRepos(owner)
    }
}