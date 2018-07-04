package org.holistic.application.thetruemeaningofislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class IslamQuestionsActivity extends AppCompatActivity {

    TextView islampage;
    TextView goodislampage, jihadpage, pillarsfaithpage, pillarsislampage , quranbelief;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islam_questions);
        islampage = findViewById(R.id.txtIslam);
        jihadpage = findViewById(R.id.jihadtxt);
        pillarsfaithpage = findViewById(R.id.pillarsfaith);
        pillarsislampage = findViewById(R.id.pillarsislam);
        quranbelief = findViewById(R.id.beliefBtn);

        quranbelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //


                Intent intent = new Intent(IslamQuestionsActivity.this, QuranBeliefActivity.class);
                startActivity(intent);

            }
        });



        islampage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to what is islam page
                Intent intent = new Intent(IslamQuestionsActivity.this, LessonTwoActivity.class);
                startActivity(intent);
            }
        });

        jihadpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IslamQuestionsActivity.this, JihadActivity.class);
                startActivity(intent);
                //go to jihad page
            }
        });


        pillarsfaithpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to pillars of faith page
                Intent intent = new Intent(IslamQuestionsActivity.this, FaithPillarsActivity.class);
                startActivity(intent);

            }
        });



        pillarsislampage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to pillars of islam page
                Intent intent = new Intent(IslamQuestionsActivity.this, PillarsActivity.class);
                startActivity(intent);

            }
        });


        islampage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate to islam page
                Intent intent = new Intent(IslamQuestionsActivity.this, AdnanActivity.class);
                startActivity(intent);

            }
        });
    }

    public void goodislamclick(View view) {

        Intent intent = new Intent(IslamQuestionsActivity.this, LessonTwoActivity.class);
        startActivity(intent);

    }
}
