package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


import ModelClass.FoodListModelClass;
import ws.wolfsoft.kwality_food.DetailPageActivity;
import ws.wolfsoft.kwality_food.Homepage;
import ws.wolfsoft.kwality_food.LoginActivity;
import ws.wolfsoft.kwality_food.MenuListAcitivity;

import ws.wolfsoft.kwality_food.R;
import ws.wolfsoft.kwality_food.WSDesignSplashScreen;



public class FoodListRecycleAdapter extends RecyclerView.Adapter<FoodListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<FoodListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public FoodListRecycleAdapter(Context context, List<FoodListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public FoodListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food_list, parent, false);


        return new FoodListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        FoodListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, Homepage.class);
                    context.startActivity(i);
                }else if(position == 1) {
                    Intent i = new Intent(context, LoginActivity.class);
                    context.startActivity(i);
                }else if(position == 2) {
                    Intent i = new Intent(context, DetailPageActivity.class);
                    context.startActivity(i);
                }else if(position == 3) {
                    Intent i = new Intent(context, MenuListAcitivity.class);
                    context.startActivity(i);
                }

            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


