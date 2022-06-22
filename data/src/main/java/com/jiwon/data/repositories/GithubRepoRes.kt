package com.jiwon.data.repo

import com.jiwon.domain.data.GithubRepo

data class GithubRepoRes(
    private val _name : String,
    private val _id : String,
    private val _data : String,
    private val _url : String
) : GithubRepo{
    override val name: String
        get() = _name

    override val url: String
        get() = _url
}
