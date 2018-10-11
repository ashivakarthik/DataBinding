package com.example.wang_.databinding.model

import android.text.TextUtils
import android.util.Patterns

class Login(var email:String?="", var pwd: String="" ){

    fun isValid() =  !TextUtils.isEmpty(email)
                   &&!TextUtils.isEmpty(pwd)
                   && Patterns.EMAIL_ADDRESS.matcher(email).matches()
                   && pwd?.length > 6
}