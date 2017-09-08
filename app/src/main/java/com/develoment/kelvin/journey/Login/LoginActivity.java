package com.develoment.kelvin.journey.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.develoment.kelvin.journey.R;

import Main.MainActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginView{

    private EditText userName;
    private EditText userPassword;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.username);
        userPassword = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);
        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        loginPresenter.checkValidation(userName.getText().toString(), userPassword.getText().toString());
    }

    @Override
    public void login() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void showPasswordError() {
        userPassword.setHint(R.string.password_error);
    }

    @Override
    public void showNameError() {
        userName.setHint(R.string.username_error);
    }
}

