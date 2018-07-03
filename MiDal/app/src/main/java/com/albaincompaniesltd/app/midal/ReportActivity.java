package com.albaincompaniesltd.app.midal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {

    EditText idnumber,fullnames,paxCar,pNumber,officevisiting;
    Button sendData;
    ProgressBar progressBar;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        TextView displayPlateNumber;
        Bundle intent = getIntent().getExtras();
        String display = intent.getString("PlateNumber");
        displayPlateNumber = findViewById(R.id.plateDisplay);
       displayPlateNumber.setText(display);
       sendData = findViewById(R.id.btnSubmit);
       idnumber = findViewById(R.id.edtIDnumber);
       fullnames = findViewById(R.id.edtfullnames);
       paxCar = findViewById(R.id.edtPaxNumber);
       pNumber = findViewById(R.id.edtPhone);
       officevisiting = findViewById(R.id.edtOffice);





       sendData.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //after submitiing data send it to the dashboard



               String ID = idnumber.getText().toString().trim();
               String fNames = fullnames.getText().toString().trim();
               String passengers = paxCar.getText().toString().trim();
               String phoneNumber = pNumber.getText().toString().trim();
               String visiting = officevisiting.getText().toString().trim();

               //Start async task operations


           }
       });




    }
}
