package com.jiwon.presentation.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jiwon.domain.data.GithubRepo
import com.jiwon.presentation.databinding.ItemGithubRepoBinding

class GithubAdapter : RecyclerView.Adapter<GithubAdapter.ViewHolder>(){
    private var _githubRepositories = emptyArray<GithubRepo>()

    class ViewHolder(binding : ItemGithubRepoBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : GithubRepo){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemGithubRepoBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(_githubRepositories.get(position))
    }

    override fun getItemCount(): Int {
        return _githubRepositories.size
    }

    companion object{
        @JvmStatic
        @BindingAdapter
        fun bindRepositories(){

        }

    }
}