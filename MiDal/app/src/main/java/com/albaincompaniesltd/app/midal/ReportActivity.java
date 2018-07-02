package com.albaincompaniesltd.app.midal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        TextView displayPlateNumber;
        Bundle intent = getIntent().getExtras();
        String display = intent.getString("PlateNumber");
        displayPlateNumber = findViewById(R.id.plateDisplay);
       displayPlateNumber.setText(display);




    }
}
