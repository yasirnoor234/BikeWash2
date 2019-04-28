package com.example.yasirnoor.bikewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainBikeWashActivity extends AppCompatActivity {

    TextView bikeWash;
    Button btnSignIn,btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bike_wash);

    }
    public void hoverRegister(View obj) {
        bikeWash = (TextView)findViewById(R.id.bikeWash);
        btnSignIn = (Button)findViewById(R.id.signIn);
        btnRegister = (Button)findViewById(R.id.register);

        if(obj.getId() == R.id.signIn) {
            btnSignIn.setBackgroundResource(R.color.textColorSignIn);
            //btnSignIn.setTextColor(R.color.black);

            Intent signIn = new Intent(MainBikeWashActivity.this,LoginActivity.class);
            startActivity(signIn);

        }

        if(obj.getId() == R.id.register) {
            btnRegister.setBackgroundResource(R.color.textColorRegister);
            //btnRegister.setTextColor(R.color.black);

            Intent register = new Intent(MainBikeWashActivity.this,RegisterActivity.class);
            startActivity(register);

        }
        if(obj.getId() == R.id.bikeWash)
            bikeWash.setBackgroundResource(R.color.black);



    }
}
