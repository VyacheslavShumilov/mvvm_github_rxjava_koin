package com.rxjava.githubmvvmrxjavakoin.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rxjava.githubmvvmrxjavakoin.R
import com.rxjava.githubmvvmrxjavakoin.databinding.ItemUserBinding
import com.rxjava.githubmvvmrxjavakoin.domain.entities.UsersEntity

class UsersViewHolder (parent: ViewGroup, private val onItemClickListener: (usersEntity: UsersEntity) -> Unit) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)) {
    private lateinit var usersEntity: UsersEntity


    private val binding = ItemUserBinding.bind(itemView).apply {
        avatarImageView.setOnClickListener {
            onItemClickListener.invoke(usersEntity)
        }
    }

    fun bind(usersEntity: UsersEntity) {
        this.usersEntity = usersEntity
        binding.avatarImageView.load(usersEntity.avatarUrl)
        binding.loginTextView.text = usersEntity.login
        binding.uidTextView.text = usersEntity.id.toString()
    }
}