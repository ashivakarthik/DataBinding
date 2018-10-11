package com.example.wang_.databinding.model;

import android.text.TextUtils;

public class UserRegister {

    String usernm, age;

    public UserRegister(String usernm, String age) {
        this.usernm = usernm;
        this.age = age;
    }

    public String getUsernm() {
        return usernm;
    }

    public void setUsernm(String usernm) {
        this.usernm = usernm;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isValid(){

        return   (!TextUtils.isEmpty(usernm)
                &&!TextUtils.isEmpty(age)
                && Integer.parseInt(age)<100 );
    }

}
