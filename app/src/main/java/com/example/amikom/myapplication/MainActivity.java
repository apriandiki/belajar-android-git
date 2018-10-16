package com.example.amikom.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.amikom.myapplication.activity.AddUserActivity;
import com.example.amikom.myapplication.activity.DetailActivity;
import com.example.amikom.myapplication.util.PreferencesHelper;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {




    PreferencesHelper session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        session = new PreferencesHelper(getApplicationContext());

        TextView lblName = (TextView) findViewById(R.id.lblName);





        if(session.checkLogin())
            finish();


        HashMap<String, String> user = session.getUserDetails();


        String name = user.get(PreferencesHelper.KEY_NAME);




        lblName.setText(Html.fromHtml("Welcome : <b>" + name + "</b>"));


    }


    public void intent (View view) {
        Intent intent =new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);

    }
    public void fragment (View view) {
        Intent intent =new Intent(MainActivity.this,FragmentWithActivity.class);
        startActivity(intent);

    }

    public void adduser(View view) {
        Intent intent =new Intent(MainActivity.this,AddUserActivity.class);
        startActivity(intent);
    }

    public void listuser(View view) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);
    }
}