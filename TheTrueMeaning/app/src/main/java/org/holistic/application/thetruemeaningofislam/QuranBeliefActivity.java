package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class QuranBeliefActivity extends AppCompatActivity {

    private TextView descTxtView;

    Button enforce, home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_belief);

        descTxtView=  findViewById(R.id.textView6);
        descTxtView.setMovementMethod(new ScrollingMovementMethod());


        enforce = findViewById(R.id.btnEnforcing);

        home = findViewById(R.id.btnHome);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //back to home

                Intent intent = new Intent(QuranBeliefActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });


        final MediaPlayer player = MediaPlayer.create(this, R.raw.enforcing);

        enforce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

                player.start();
            }
        });



    }
}
