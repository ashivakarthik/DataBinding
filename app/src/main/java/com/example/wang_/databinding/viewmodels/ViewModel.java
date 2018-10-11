package com.example.wang_.databinding.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.example.wang_.databinding.BR;
import com.example.wang_.databinding.model.Login;
import com.example.wang_.databinding.model.Register;
import com.example.wang_.databinding.model.UserRegister;

public class ViewModel extends BaseObservable{

    String msg_success = "Login Success";
    String msg_fail = "Login Fail";
    Login login;
    Register register;
    @Bindable
    String toast_msg_valid = null;

    public ViewModel() {
        login = new Login("","");
        register = new Register("","");
    }

    public void onLoginButtonClicked(){
        if(login.isValid()){
           setToast_msg_valid(msg_success);
        }
        else{
           setToast_msg_valid(msg_fail);
        }
    }

    public void onRegisterButtonClicked(){
        if(register.isValid()){
            Log.d("MyTag", "Success");
            setToast_msg_valid(msg_success);
        }
        else{
            Log.d("MyTag", "Fail");
            setToast_msg_valid(msg_fail);
        }
    }

    public String getToast_msg_valid() {
        return toast_msg_valid;
    }

    public void setToast_msg_valid(String toast_msg_valid) {
        this.toast_msg_valid = toast_msg_valid;
        notifyPropertyChanged(BR.toast_msg_valid);

    }

    public void setEmailTextChange(CharSequence email){
        login.setEmail(email.toString());
    }

    public void setPwdTextChange(CharSequence pwd){
        login.setPwd(pwd.toString());
    }


    public void setUserNameTextChange(CharSequence usernm){
        register.setUsername(usernm.toString());
    }

    public void setAgeTextChange(CharSequence age){
        register.setAge(age.toString());
    }


}
