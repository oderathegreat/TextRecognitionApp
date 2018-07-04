package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class PillarsActivity extends AppCompatActivity {

    Button fromPillars, ListentoPillarsIslam;
    private TextView descTxtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pillars);

        ListentoPillarsIslam = findViewById(R.id.btnListenToPillarsIslam);
        fromPillars = findViewById(R.id.btnFromIslamPillars);

        descTxtView=  findViewById(R.id.textView6);
        descTxtView.setMovementMethod(new ScrollingMovementMethod());


        fromPillars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PillarsActivity.this, FaithPillarsActivity.class);
                startActivity(intent);

            }
        });

        final MediaPlayer player = MediaPlayer.create(this, R.raw.pillarsislam);

        ListentoPillarsIslam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //play record
                player.start();
            }
        });
    }
}
