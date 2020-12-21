package com.example.mydatabaseapp.userDetails

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mydatabaseapp.database.RegisterRepository
import java.lang.IllegalArgumentException

class UserDetalisFactory (
    private  val repository: RegisterRepository,
    private val application: Application
): ViewModelProvider.Factory{
    @Suppress("Unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(UserDetailsViewModel::class.java)) {
            return UserDetailsViewModel(repository, application) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}