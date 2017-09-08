package com.develoment.kelvin.journey.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.develoment.kelvin.journey.R;

import Main.MainActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginViewInterface{

    private EditText userName;
    private EditText userPassword;
    private LoginPresenterInterface loginPresenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.username);
        userPassword = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);

        loginPresenterInterface = new LoginPresenterImpl(this);//用 LoginViewInterface 代替 context 傳ds進去'
    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        loginPresenterInterface.isLoginValid(userName.getText().toString(), userPassword.getText().toString());
    }

    @Override
    public void showErrorName() {
        userName.setHint(getString(R.string.username_error));
    }

    @Override
    public void showErrorPassword() {
        userPassword.setHint(getString(R.string.password_error));
    }
}
