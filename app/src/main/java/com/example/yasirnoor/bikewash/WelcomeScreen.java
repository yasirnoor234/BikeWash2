package com.example.yasirnoor.bikewash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    Button showFeatures;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        showFeatures = (Button)findViewById(R.id.showFeatures);
        showFeatures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //User Welcome in show features Launch Features screen activity
                Intent intent=new Intent(WelcomeScreen.this,BottomMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
