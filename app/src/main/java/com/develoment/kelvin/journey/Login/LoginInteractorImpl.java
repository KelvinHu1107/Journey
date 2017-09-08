package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public class LoginInteractorImpl implements LoginInteractor{

    @Override
    public void checkInfo(String name, String password, LoginInteractor.OnReturn onReturn) {
        boolean error = false;

        if(name.isEmpty()){
            error = true;
            onReturn.errorName();

        }
        if(password.isEmpty()){
            error = true;
            onReturn.errorPassword();
        }

        if(!error){
            onReturn.onSuccess();
        }
    }



}
