package com.example.apna_bazar;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(Splashscreen.this, registration.class);
                startActivity(i);
                finish();

            }
        }, 3000);




    }
}