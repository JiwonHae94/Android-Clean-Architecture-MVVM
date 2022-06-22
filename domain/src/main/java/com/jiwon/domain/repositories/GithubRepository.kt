package com.jiwon.domain.repositories

import com.jiwon.domain.data.GithubRepo

interface GithubRepository {
    suspend fun getRepos(owner : String) : List<GithubRepo>
}