package com.example.anuj.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by anuj on 9/21/17.
 */

public class LoginFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login,container,false);
        //Button signup=(Button)view.findViewById(R.id.btn_signup);
        //signup.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
//        if(view.getId()==R.id.btn_signup){
//            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//            SignUpFragment signUpFragment=new SignUpFragment();
//            transaction.replace(R.id.fragment_container,signUpFragment,"loginFragment");
//            transaction.commit();
//
//        }
    }
}
