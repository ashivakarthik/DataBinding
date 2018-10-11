package com.example.wang_.databinding.model

import android.text.TextUtils

class Register(var username: String?="", var age: String="") {

    fun isValid() =  !TextUtils.isEmpty(username)
                 &&!TextUtils.isEmpty(age)
                 && age.toInt() < 100
}