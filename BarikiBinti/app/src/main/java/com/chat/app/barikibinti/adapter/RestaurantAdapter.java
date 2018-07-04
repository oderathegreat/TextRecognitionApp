package com.chat.app.barikibinti.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chat.app.barikibinti.R;
import com.chat.app.barikibinti.model.Restaurant;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Hp on 6/11/2018.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder> {

    private ArrayList<Restaurant> resData;
    private Activity Mactivity;

    public RestaurantAdapter(ArrayList<Restaurant> data, Activity activity) {
        this.resData = data;
        this.Mactivity = activity;
    }







    public class RestaurantHolder extends RecyclerView.ViewHolder{



        ImageView restimage;
        TextView resttxtname;
        TextView resttxtAddress;
        TextView resttxtCost;
        TextView restxtRating;
        TextView resttxtDistance;



        public RestaurantHolder(View itemView) {
            super(itemView);


            //get you views

            restimage = itemView.findViewById(R.id.imageViewRest);
            resttxtname = itemView.findViewById(R.id.restNameView);
            resttxtAddress = itemView.findViewById(R.id.restAddressView);
            resttxtCost = itemView.findViewById(R.id.restCostView);
            restxtRating = itemView.findViewById(R.id.restRating);
            resttxtDistance = itemView.findViewById(R.id.restdistance);

        }

        public  void  setName(String name) {resttxtname.setText(name);}

        public  void  setAddress(String address) {resttxtAddress.setText(address);}

        public  void  setCost(String cost) {resttxtCost.setText(cost);}
        public  void  setRating(String rating) {restxtRating.setText(rating);}
        public  void  setDistance(int distance) {resttxtDistance.setText(distance);}






    }


    @Override
    public RestaurantAdapter.RestaurantHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_rest, parent, false);
        return new RestaurantHolder(v);


    }

    @Override
    public void onBindViewHolder(RestaurantAdapter.RestaurantHolder holder, int position) {


        Restaurant restaurant = resData.get(position);

        holder.setName(restaurant.getName());
        holder.setAddress(restaurant.getAddress());
        holder.setCost("Average Cost for two is "+ restaurant.getCost());
        holder.setDistance(restaurant.getDistance());
        holder.setRating(restaurant.getRating());


        Glide.with(Mactivity)
                .load(restaurant.getRating())
                .into(holder.restimage);


    }

    @Override
    public int getItemCount() {

        if (resData == null)
        return 0;
        return resData.size();
    }
}
