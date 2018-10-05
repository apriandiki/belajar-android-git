package com.example.amikom.myapplication.until;

import java.util.jar.Attributes;

/**
 * Created by amikom on 28/09/2018.
 */

public class preferencesHelper {
    private static preferencesHelper INSTANCE;
    private sharedpreferences sharedpreferences;

    private preferencesHelper(context context){
        sharedpreferences=context
                .getApplicationcontext()
                .getsharedpreferences("simple.android.app",context.Mode_private);
    }
    public static preferencesHelper getIntance(contex contex){
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

