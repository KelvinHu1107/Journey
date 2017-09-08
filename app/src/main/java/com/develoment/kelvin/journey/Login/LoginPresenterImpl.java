package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnReturn {

    private LoginView loginView;
    private LoginInteractor loginInteractor = new LoginInteractorImpl();

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void checkValidation(String name, String password) {
        loginInteractor.checkInfo(name, password, this);
    }

    @Override
    public void onSuccess() {
        loginView.login();
    }

    @Override
    public void errorName() {
        loginView.showNameError();
    }

    @Override
    public void errorPassword() {
        loginView.showPasswordError();
    }
}
