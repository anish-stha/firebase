package com.example.anuj.myapplication;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class signuplogin extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuplogin);
        FirebaseMessaging.getInstance().subscribeToTopic("pushNotifications");
        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            LoginFragment loginFragment=new LoginFragment();
            transaction.add(R.id.fragment_container,loginFragment,"loginFragment");
            transaction.commit();

        }



    }





}
