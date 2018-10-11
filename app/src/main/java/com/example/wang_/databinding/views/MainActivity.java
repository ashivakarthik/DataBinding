package com.example.wang_.databinding.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.wang_.databinding.R;
import com.example.wang_.databinding.databinding.ActivityMainBinding;
import com.example.wang_.databinding.model.Login;
import com.example.wang_.databinding.viewmodels.ViewModel;

public class MainActivity extends AppCompatActivity {

    EditText editText_usr, editText_pwd;
    Button button_send;
    Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //login = new Login("andy@gmail.com","123");

        //activityMainBinding.setUser(login);
        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewmodel(new ViewModel());
        activityMainBinding.executePendingBindings();

    }

    @BindingAdapter({"toast_msg_valid"})
    public static void showToast(View view, String msg){
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_LONG).show();
    }


}
