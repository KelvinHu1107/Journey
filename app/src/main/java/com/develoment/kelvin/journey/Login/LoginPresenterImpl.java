package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public class LoginPresenterImpl implements LoginPresenterInterface, LoginInteractorInterface.OnListenReturn {

    private LoginInteractorInterface loginInteractorInterface = new LoginInteractorImpl();
    private LoginViewInterface loginViewInterface;

    public LoginPresenterImpl(LoginViewInterface loginViewInterface) {
        this.loginViewInterface = loginViewInterface;
    }

    @Override
    public void onSuccess() {
        loginViewInterface.loginSuccess();
    }

    @Override
    public void userNameOnFail() {
        loginViewInterface.showErrorName();
    }

    @Override
    public void userPasswordOnFail() {
        loginViewInterface.showErrorPassword();
    }

    @Override
    public void isLoginValid(String userName, String userPassword) {
            loginInteractorInterface.login(userName, userPassword, this);
    }

    @Override
    public void onDestroy() {
        if(loginViewInterface != null){
            loginViewInterface = null;
        }
    }
}
