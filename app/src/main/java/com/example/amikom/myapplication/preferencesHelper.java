package com.example.amikom.myapplication;

/**
 * Created by amikom on 05/10/2018.
 */

public class preferencesHelper {
          if (INSTANCE==null){
        INSTANCE=new preferencesHelper(context);
    }
        return INSTANCE;
}
    public sharedpreferences pref(){
        return sharedpreferences;
    }
    public Boolean isLogin(){
        return sharedpreferences.getBoolean("isLogin",false);
    }
    public void  setLogin(Boolean isCall){
        sharedpreferences.edit().putBoolean(ïsLogin),isCall).apply();
    }
    public void setName(String isName){

    }
}
