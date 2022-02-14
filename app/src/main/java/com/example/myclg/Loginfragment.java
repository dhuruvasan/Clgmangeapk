package com.example.myclg;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Loginfragment extends Fragment {

    EditText email,pass;
    TextView forgetpass;
    Button login;
    float v=0;
    MainActivity mainActivity=new MainActivity();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root =(ViewGroup) inflater.inflate(R.layout.login_fragment, container, false );



        email=root.findViewById(R.id.email);
        pass=root.findViewById(R.id.password);
        forgetpass=root.findViewById(R.id.forgetpass);
        login=root.findViewById(R.id.loginbutton);

        email.setTranslationY(300);
        pass.setTranslationY(300);
        forgetpass.setTranslationY(300);
        login.setTranslationY(300);

        email.setAlpha(v);
        pass.setAlpha(v);
        forgetpass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        forgetpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();


        return root;
    }


}
