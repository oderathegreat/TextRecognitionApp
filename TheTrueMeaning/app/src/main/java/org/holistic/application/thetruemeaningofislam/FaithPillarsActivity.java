package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class FaithPillarsActivity extends AppCompatActivity {

    Button nextlessonfromFaith, listenFaith;

    private TextView descTxtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faith_pillars);

        listenFaith = findViewById(R.id.btnListenFaith);
        nextlessonfromFaith = findViewById(R.id.btnFromFaith);

        descTxtView=  findViewById(R.id.textView6);
        descTxtView.setMovementMethod(new ScrollingMovementMethod());


        nextlessonfromFaith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

                Intent intent = new Intent(FaithPillarsActivity.this, JihadActivity.class);
                startActivity(intent);
            }
        });

        final MediaPlayer player = MediaPlayer.create(this, R.raw.pillarsfaith);
        listenFaith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                player.start();

            }
        });

    }




}
