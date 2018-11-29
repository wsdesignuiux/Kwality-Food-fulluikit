package ws.wolfsoft.kwality_food;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.bumptech.glide.util.Util;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;

import java.util.ArrayList;
import java.util.List;

import ExtraClass.Profile;
import ExtraClass.TinderCard;
import ExtraClass.Utills;

public class Homepage extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner;


    private SwipePlaceHolderView mSwipeView;
    private Context mContext;


    LinearLayout linaer1,linear2,linear3,linear4,linear5,line1,line2,line3,
            line4,line5;
    ImageView home,compass,search,cart,menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        linaer1 =  findViewById(R.id.linear1);
        linear2 =  findViewById(R.id.linear2);
        linear3 =  findViewById(R.id.linear3);
        linear4 =  findViewById(R.id.linear4);
        linear5 =  findViewById(R.id.linear5);
        line1 =  findViewById(R.id.line1);
        line2 =  findViewById(R.id.line2);
        line3 =  findViewById(R.id.line3);
        line4 =  findViewById(R.id.line4);
        line5 =  findViewById(R.id.line5);
        home =  findViewById(R.id.home);
        compass =  findViewById(R.id.compass);
        search =  findViewById(R.id.search);
        cart =  findViewById(R.id.cart);
        menu =  findViewById(R.id.menu);


        linaer1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);


        spinner = (Spinner)findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("Bangalore, India");
        list.add("Pune, India");
        list.add("Mumbai, India");
        list.add("Delhi, India");
        list.add("Surat, India");
        list.add("Nagpur, India");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Homepage.this, R.layout.spinner_item, R.id.spinner_text, list);
        spinner.setAdapter(dataAdapter);




        mSwipeView = (SwipePlaceHolderView)findViewById(R.id.swipeView);
        mContext = getApplicationContext();

        mSwipeView.getBuilder()
                .setDisplayViewCount(3)
                .setSwipeDecor(new SwipeDecor()
                        .setPaddingTop(20)
                        .setRelativeScale(0.01f)
                        .setSwipeInMsgLayoutId(R.layout.tinder_swipe_in_msg_view)
                        .setSwipeOutMsgLayoutId(R.layout.tinder_swipe_out_msg_view));



        for(Profile profile : Utills.loadProfiles(this.getApplicationContext())){
            mSwipeView.addView(new TinderCard(mContext, profile, mSwipeView));
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.linear1:

                home.setImageResource(R.drawable.ic_home_red);
                compass.setImageResource(R.drawable.ic_compass_gray);
                search.setImageResource(R.drawable.ic_search_gray);
                cart.setImageResource(R.drawable.ic_shopping_cart_gray);
                menu.setImageResource(R.drawable.ic_menu_gray);

                line1.setBackgroundResource(R.drawable.red_line);
                line2.setBackgroundResource(R.drawable.tra_line);
                line3.setBackgroundResource(R.drawable.tra_line);
                line4.setBackgroundResource(R.drawable.tra_line);
                line5.setBackgroundResource(R.drawable.tra_line);


                break;


            case R.id.linear2:

                home.setImageResource(R.drawable.ic_home_gray);
                compass.setImageResource(R.drawable.ic_compass_red);
                search.setImageResource(R.drawable.ic_search_gray);
                cart.setImageResource(R.drawable.ic_shopping_cart_gray);
                menu.setImageResource(R.drawable.ic_menu_gray);

                line1.setBackgroundResource(R.drawable.tra_line);
                line2.setBackgroundResource(R.drawable.red_line);
                line3.setBackgroundResource(R.drawable.tra_line);
                line4.setBackgroundResource(R.drawable.tra_line);
                line5.setBackgroundResource(R.drawable.tra_line);

                break;


            case R.id.linear3:

                home.setImageResource(R.drawable.ic_home_gray);
                compass.setImageResource(R.drawable.ic_compass_gray);
                search.setImageResource(R.drawable.ic_search_red);
                cart.setImageResource(R.drawable.ic_shopping_cart_gray);
                menu.setImageResource(R.drawable.ic_menu_gray);

                line1.setBackgroundResource(R.drawable.tra_line);
                line2.setBackgroundResource(R.drawable.tra_line);
                line3.setBackgroundResource(R.drawable.red_line);
                line4.setBackgroundResource(R.drawable.tra_line);
                line5.setBackgroundResource(R.drawable.tra_line);

                break;

            case R.id.linear4:

                home.setImageResource(R.drawable.ic_home_gray);
                compass.setImageResource(R.drawable.ic_compass_gray);
                search.setImageResource(R.drawable.ic_search_gray);
                cart.setImageResource(R.drawable.ic_shopping_cart_red);
                menu.setImageResource(R.drawable.ic_menu_gray);

                line1.setBackgroundResource(R.drawable.tra_line);
                line2.setBackgroundResource(R.drawable.tra_line);
                line3.setBackgroundResource(R.drawable.tra_line);
                line4.setBackgroundResource(R.drawable.red_line);
                line5.setBackgroundResource(R.drawable.tra_line);

                break;


            case R.id.linear5:

                home.setImageResource(R.drawable.ic_home_gray);
                compass.setImageResource(R.drawable.ic_compass_gray);
                search.setImageResource(R.drawable.ic_search_gray);
                cart.setImageResource(R.drawable.ic_shopping_cart_gray);
                menu.setImageResource(R.drawable.ic_menu_red);

                line1.setBackgroundResource(R.drawable.tra_line);
                line2.setBackgroundResource(R.drawable.tra_line);
                line3.setBackgroundResource(R.drawable.tra_line);
                line4.setBackgroundResource(R.drawable.tra_line);
                line5.setBackgroundResource(R.drawable.red_line);

                break;

        }

    }
}