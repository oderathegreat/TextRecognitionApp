package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class JihadActivity extends AppCompatActivity {


    private TextView descTxtView;
    Button nextLesson, listenJihad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jihad);

        listenJihad = findViewById(R.id.btnListenJihad);
        nextLesson = findViewById(R.id.btnJihadNextLesson);


        descTxtView=  findViewById(R.id.textView6);
        descTxtView.setMovementMethod(new ScrollingMovementMethod());

        final MediaPlayer player = MediaPlayer.create(this, R.raw.whatisjihad);
        listenJihad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listen to teaching on jihad

                player.start();

            }
        });



nextLesson.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //
        Intent intent = new Intent(JihadActivity.this, QuranBeliefActivity.class);
        startActivity(intent);
    }
});



    }
}
