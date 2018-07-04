package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class LessonTwoActivity extends AppCompatActivity {


    Button nextpage, listengoodMuslim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        nextpage = findViewById(R.id.btnGoodMuslimNext);
        listengoodMuslim = findViewById(R.id.btnListenGoodMuslim);


        TextView descTxtView = findViewById(R.id.textView6);
        descTxtView.setMovementMethod(new ScrollingMovementMethod());
        
        
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate to pillars something page

                Intent intent = new Intent(LessonTwoActivity.this, PillarsActivity.class);
                startActivity(intent);
            }
        });

        final MediaPlayer player = MediaPlayer.create(this, R.raw.goodmuslim);

        listengoodMuslim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listen to teaching
                player.start();

            }
        });
    }
}
