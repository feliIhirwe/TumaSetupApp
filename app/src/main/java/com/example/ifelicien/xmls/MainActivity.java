
package com.example.ifelicien.xmls;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import ActivityListerner.switchActivityListerner;
import activities_all.ShowCreateOrEdit;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        loginBtn= findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new switchActivityListerner(getApplicationContext(), ShowCreateOrEdit.class));

    }
}
