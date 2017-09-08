package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public interface LoginInteractor {
    void checkInfo(String name, String password, LoginInteractor.OnReturn onReturn);

    interface OnReturn{
        void onSuccess();
        void errorName();
        void errorPassword();
    };

}
