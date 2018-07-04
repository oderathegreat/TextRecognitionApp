package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdnanActivity extends AppCompatActivity {

    Button listen;
    Button lessonContinue;
    private TextView descTxtView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adnan2);

          listen = findViewById(R.id.ListenToTeachingIslam);
          lessonContinue = findViewById(R.id.nextWhatisIslamBtn);



        descTxtView=  findViewById(R.id.textView6);
        descTxtView.setMovementMethod(new ScrollingMovementMethod());


          lessonContinue.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  //go to next lesson

                  Intent intent  = new Intent(AdnanActivity.this, LessonTwoActivity.class);
                  startActivity(intent);
              }
          });
          final MediaPlayer player = MediaPlayer.create(this, R.raw.whatisislam);

          listen.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  //Start the streaming

                 player.start();

              }
          });
    }
}