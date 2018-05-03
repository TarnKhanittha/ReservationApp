package com.example.dty.reservationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegulationRoomActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView arrowBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulation_room);

        arrowBack = (ImageView) findViewById(R.id.arrow_from_calendar);
        arrowBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if ( view == (View) arrowBack){
            final Intent arrowIntent = new Intent(RegulationRoomActivity.this, MainMenuActivity.class);
            RegulationRoomActivity.this.startActivity(arrowIntent);
            RegulationRoomActivity.this.finish();
        }
    }


}
