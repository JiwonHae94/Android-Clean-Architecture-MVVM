package com.jiwon.domain.usecases

import com.jiwon.domain.data.GithubRepo
import com.jiwon.domain.repositories.GithubRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class GetGitbugRepoUseCase(
    private val githubRepository : GithubRepository
) {
    operator fun invoke(
        owner : String,
        scope : CoroutineScope,
        onResult : (List<GithubRepo>) -> Unit = {}
    ){
        scope.launch(Dispatchers.Main){
            val deferred = async(Dispatchers.IO) {
                githubRepository.getRepos(owner)
            }
            onResult(deferred.await())
        }
    }
}