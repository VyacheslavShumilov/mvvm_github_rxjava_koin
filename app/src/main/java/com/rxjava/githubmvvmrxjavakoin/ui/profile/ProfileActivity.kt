package com.rxjava.githubmvvmrxjavakoin.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import coil.load
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.rxjava.githubmvvmrxjavakoin.databinding.ActivityProfileBinding
import com.rxjava.githubmvvmrxjavakoin.domain.entities.ProfileEntity
import com.rxjava.githubmvvmrxjavakoin.domain.entities.UsersEntity
import io.reactivex.rxjava3.disposables.CompositeDisposable
import java.util.Objects

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    private val PROFILE_KEY = "profile"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val selectedProfile = intent.getParcelableExtra<UsersEntity>(PROFILE_KEY)
        if (selectedProfile != null) {
            initViews(selectedProfile)
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
        }
    }


    private fun initViews(it: UsersEntity) {
        with(binding) {
            avatarUserImage.load(it.avatarUrl)
            textView2.text = it.login
            userIdTxtView.text = it.id.toString()
        }
    }
}