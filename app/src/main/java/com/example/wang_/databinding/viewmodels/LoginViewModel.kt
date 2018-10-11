package com.example.wang_.databinding.viewmodels

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.wang_.databinding.model.Login

class LoginViewModel(var login: Login? = Login()): BaseObservable() {
    companion object {
        val msg_success = "Login Success"
        val msg_fail = "Login Fail"
        var login = Login()

        @Bindable  var toast_msg_valid : String? = null
    }

    //fun onLoginButtonClicked(){ if(login.isValid()) set

    fun setToast_msg_valid(toast_msg_valid: String){
        this.setToast_msg_valid(toast_msg_valid)
    }

    /*

        public void onLoginButtonClicked(){
        if(login.isValid()){
           setToast_msg_valid(msg_success);
        }
        else{
           setToast_msg_valid(msg_fail);
        }
    }
        public void setToast_msg_valid(String toast_msg_valid) {
        this.toast_msg_valid = toast_msg_valid;
        notifyPropertyChanged(BR.toast_msg_valid);

    }

     */

}