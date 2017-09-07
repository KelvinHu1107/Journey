package com.develoment.kelvin.journey.Login;

/**
 * Created by Kelvin on 2017/9/8.
 */

public class LoginInteractorImpl implements LoginInteractorInterface {


    @Override
    public void login(final String userName, final String userPassword, final OnListenReturn listenReturn) {


        boolean error = false;

        if(userName.isEmpty()){
            listenReturn.userNameOnFail();
            error = true;
        }

        if(userPassword.isEmpty()){
            listenReturn.userPasswordOnFail();
            error = true;
        }

        if(!error){
            listenReturn.onSuccess();
        }
    }

}
