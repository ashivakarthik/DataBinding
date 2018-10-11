package com.example.wang_.databinding.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.wang_.databinding.R;
import com.example.wang_.databinding.databinding.ActivityRegisterBinding;
import com.example.wang_.databinding.viewmodels.ViewModel;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityRegisterBinding activityRegisterBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_register);
        activityRegisterBinding.setViewmodel(new ViewModel());
        activityRegisterBinding.executePendingBindings();

    }
    @BindingAdapter({"toast_msg_valid"})
    public static void showToast(View view, String msg){
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_LONG).show();
    }


}
