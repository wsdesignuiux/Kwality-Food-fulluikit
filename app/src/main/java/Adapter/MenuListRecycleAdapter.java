package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.FoodListModelClass;
import ModelClass.MenuListModelClass;
import ws.wolfsoft.kwality_food.DetailPageActivity;
import ws.wolfsoft.kwality_food.Homepage;
import ws.wolfsoft.kwality_food.LoginActivity;
import ws.wolfsoft.kwality_food.R;


public class MenuListRecycleAdapter extends RecyclerView.Adapter<MenuListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<MenuListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);


        }

    }


    public MenuListRecycleAdapter(Context context, List<MenuListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MenuListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu_list, parent, false);


        return new MenuListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        MenuListModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


