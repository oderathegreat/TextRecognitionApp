package com.valentishealth.app.cosmos;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


   Button proceed;
   TextView display;
   EditText username, phone;
   ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     proceed = findViewById(R.id.btnproceed);
     display = findViewById(R.id.txtdisplay);
     username = findViewById(R.id.edtname);
     phone = findViewById(R.id.edtphone);
     progressDialog = new ProgressDialog(this);

     progressDialog.setMessage("Let's get you started,");







        //Alert Dialog

 proceed.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         //exit application
         closeApp();

         Runnable runnable = new Runnable() {
             @Override
             public void run() {

             }
         };

         Handler handler = new Handler();
         handler.postDelayed(runnable, 3000);

         progressDialog.dismiss();

     }
 });





    }

    private void closeApp() {

        progressDialog.show();

        new AlertDialog.Builder(this)
                .setTitle("Welcome, Kindly select language")
                .setMessage("Which language are you conversant with ? ")
                .setPositiveButton("ENGLISH", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "launching english version", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("SPANISH", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "launching swahili version", Toast.LENGTH_SHORT).show();
                progressDialog.show();

            }
        }).show();


    }


    class loadDataTasks extends AsyncTask<String, String, String> {




        @Override
        protected String doInBackground(String... strings) {
            return null;


        }
    }




}
