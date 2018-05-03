package com.example.dty.reservationapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeAvtivityOpen();
    }

    private void changeAvtivityOpen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent openIntent = new Intent(MainActivity.this,LoginActivity.class);
                MainActivity.this.startActivity(openIntent);
                MainActivity.this.finish();
            }
        },5000);
    }
}
