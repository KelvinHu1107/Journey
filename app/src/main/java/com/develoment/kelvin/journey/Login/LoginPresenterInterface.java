package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public interface LoginPresenterInterface {

    void isLoginValid(String userName, String userPassword);

    void onDestroy();

}
