package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public interface LoginInteractorInterface {

    interface OnListenReturn{

        void onSuccess();

        void userNameOnFail();

        void userPasswordOnFail();
    }

    void login(String userName, String userPassword, OnListenReturn listenReturn);

}
