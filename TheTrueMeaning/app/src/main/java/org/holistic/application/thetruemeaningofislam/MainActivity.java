package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button start, firstIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.btnstart);

        firstIntro = findViewById(R.id.btnIntro);

        final MediaPlayer player = MediaPlayer.create(this, R.raw.myintro);
        firstIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                player.start();


            }
        });



    }

    public void startlesson(View view) {

        Intent intent = new Intent(MainActivity.this, IslamQuestionsActivity.class);
        startActivity(intent);
    }
}
