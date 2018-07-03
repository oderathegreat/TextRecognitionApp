package com.albaincompaniesltd.app.midal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class ReportActivity extends AppCompatActivity {

    EditText idnumber,fullnames,paxCar,pNumber,officevisiting;
    Button sendData;
    ProgressDialog dialog;






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
       dialog = new ProgressDialog(this);
       dialog.setMessage("Submitting Data........");








       sendData.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //after submitiing data send it to the dashboard

           //url to post data and link endpoint
               String url = "";

               String ID = idnumber.getText().toString().trim();
               String fNames = fullnames.getText().toString().trim();
               String passengers = paxCar.getText().toString().trim();
               String phoneNumber = pNumber.getText().toString().trim();
               String visiting = officevisiting.getText().toString().trim();

               //Start async task operations

               AsyncHttpClient httpClient = new AsyncHttpClient();
               RequestParams params = new RequestParams();
               params.put("id", ID );
               params.put("fullnames", fNames);
               params.put("passengersboard", passengers);
               params.put("phonenumber", phoneNumber);
               params.put("officevisting", visiting);

               dialog.show();

        httpClient.post(url, params, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                //Toast a message if opaerations fail
                Toast.makeText(ReportActivity.this, "OOPS! Sorry failed to connect", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

                //upon success execute code

                Toast.makeText(ReportActivity.this, "SUCCESS! Data posted ", Toast.LENGTH_SHORT).show();

            }
        });




           }
       });




    }
}
