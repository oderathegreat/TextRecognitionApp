package com.chat.app.chatdisplay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Hp on 6/7/2018.
 */

public class ListViewAdapter extends BaseAdapter {

    //setting our variables

    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;


    //Generate our constructor


    public ListViewAdapter(Context context, List<Model> modelList) {
        mContext = context;
        this.modelList = modelList;

        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }


    public  class  ViewHolder{

        TextView txtTitle,txtDesc;
        ImageView mIcon;


    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView==null) {

             holder = new ViewHolder();
             convertView = inflater.inflate(R.layout.row, null);


             //locating my views in the row.xml file

            holder.txtTitle = convertView.findViewById(R.id.mainTitle);
            holder.txtDesc = convertView.findViewById(R.id.mainDesc);
            holder.mIcon = convertView.findViewById(R.id.mainIcon);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder)convertView.getTag();
        }

        //set the results into textviews
          holder.txtTitle.setText(modelList.get(position).getTitle());
        holder.txtDesc.setText(modelList.get(position).getDesc());
        holder.mIcon.setImageResource(modelList.get(position).getIcon());


        //make the list view clickable

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //trigger the click events

            }
        });


        return null;
    }

    public void filter (String charText){

        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length()==0) {

            modelList.addAll(arrayList);

        } else {

            for (Model model : arrayList) {

                if (model.getTitle().toLowerCase(Locale.getDefault())
                    .contains(charText)) {

                          modelList.add(model);
                }

            }
        }
     notifyDataSetChanged();
    }



}
