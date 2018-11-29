package ws.wolfsoft.kwality_food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.FoodListRecycleAdapter;
import ModelClass.FoodListModelClass;

public class FoodListActivity extends AppCompatActivity {



    private ArrayList<FoodListModelClass> foodListModelClasses;
    private RecyclerView recyclerView;
    private FoodListRecycleAdapter bAdapter;

    private  String title[] = {"Homepage","LoginActivity","DetailPageActivity","MenuActivity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);



        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FoodListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        foodListModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            FoodListModelClass beanClassForRecyclerView_contacts = new FoodListModelClass(title[i]);
            foodListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new FoodListRecycleAdapter(FoodListActivity.this,foodListModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
