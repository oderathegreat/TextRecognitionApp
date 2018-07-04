package com.albaincompaniesltd.app.demonstrater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SamsungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);
    }

    public void tecnoclick(View view) {
        Intent ted= new Intent(SamsungActivity.this,TecnoActivity.class);
        startActivity(ted);
    }
}
