package com.chat.app.chatdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String [] title;
    String []  description;
    int [] icon;

    ArrayList<Model> arrayList = new ArrayList<Model>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lstview);


        title = new String[] {"Chef","Recipes", "Awards", "Experience"};
        description = new String[] {"Chef bio.........","Recipes to have......", "Awards won.....", "Experience goten........."};
        icon = new int[]{ R.drawable.chef, R.drawable.recipe, R.drawable.award, R.drawable.experience};

        listView.setAdapter(adapter);

        for (int x =0; x<title.length; x++) {

            Model model = new Model(title[x], description[x],icon[x]);

            //binding all strings in an array


        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem myactionMenu = menu.findItem(R.id.search);
        SearchView searchView = (SearchView)myactionMenu.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                if (TextUtils.isEmpty(newText)){
                     adapter.filter("");
                     listView.clearTextFilter();


                } else {

                    adapter.filter(newText);
                }

                return true;

            }
        });

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.search) {
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
