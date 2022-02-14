package com.example.myclg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Signupfragment extends Fragment {


    EditText emaill,passs,mobilnumber,enterpass;
    Button sign;
    float v=0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root =(ViewGroup) inflater.inflate(R.layout.signup_fragment, container, false );

        emaill=root.findViewById(R.id.emaill);
        passs=root.findViewById(R.id.passwordd);
        mobilnumber=root.findViewById(R.id.mobilnumber);
        enterpass=root.findViewById(R.id.enterpass);
        sign=root.findViewById(R.id.sign);

        emaill.setTranslationY(300);
        passs.setTranslationY(300);
        mobilnumber.setTranslationY(300);
        enterpass.setTranslationY(300);
        sign.setTranslationY(300);

        emaill.setAlpha(v);
        passs.setAlpha(v);
        mobilnumber.setAlpha(v);
        enterpass.setAlpha(v);
        sign.setAlpha(v);

        emaill.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        passs.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        mobilnumber.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        enterpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        sign.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();

        return root;
    }
}
