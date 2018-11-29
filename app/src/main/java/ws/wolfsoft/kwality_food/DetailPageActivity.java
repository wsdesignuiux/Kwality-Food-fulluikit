package ws.wolfsoft.kwality_food;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailPageActivity extends AppCompatActivity implements View.OnClickListener {


    LinearLayout linaer1,linear2,linear3,linear4,linear5,linear6,
            linear7,linear8,linear9;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);


        linaer1 =  findViewById(R.id.linear1);
        linear2 =  findViewById(R.id.linear2);
        linear3 =  findViewById(R.id.linear3);
        linear4 =  findViewById(R.id.linear4);
        linear5 =  findViewById(R.id.linear5);
        linear6 =  findViewById(R.id.linear6);
        linear7 =  findViewById(R.id.linear7);
        linear8 =  findViewById(R.id.linear8);
        linear9 =  findViewById(R.id.linear9);
        txt1 =  findViewById(R.id.txt1);
        txt2 =  findViewById(R.id.txt2);
        txt3 =  findViewById(R.id.txt3);
        txt4 =  findViewById(R.id.txt4);
        txt5 =  findViewById(R.id.txt5);
        txt6 =  findViewById(R.id.txt6);
        txt7 =  findViewById(R.id.txt7);
        txt8 =  findViewById(R.id.txt8);
        txt9 =  findViewById(R.id.txt9);

        linaer1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);
        linear6.setOnClickListener(this);
        linear7.setOnClickListener(this);
        linear8.setOnClickListener(this);
        linear9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.linear1:
                linaer1.setBackgroundResource(R.drawable.red_light_rect);
                linear2.setBackgroundResource(R.drawable.gray_light_rect);
                linear3.setBackgroundResource(R.drawable.gray_light_rect);


                txt1.setTextColor(Color.parseColor("#f34949"));
                txt2.setTextColor(Color.parseColor("#a9a9b0"));
                txt3.setTextColor(Color.parseColor("#a9a9b0"));
                break;

            case R.id.linear2:
                linaer1.setBackgroundResource(R.drawable.gray_light_rect);
                linear2.setBackgroundResource(R.drawable.red_light_rect);
                linear3.setBackgroundResource(R.drawable.gray_light_rect);


                txt1.setTextColor(Color.parseColor("#a9a9b0"));
                txt2.setTextColor(Color.parseColor("#f34949"));
                txt3.setTextColor(Color.parseColor("#a9a9b0"));
                break;

            case R.id.linear3:
                linaer1.setBackgroundResource(R.drawable.gray_light_rect);
                linear2.setBackgroundResource(R.drawable.gray_light_rect);
                linear3.setBackgroundResource(R.drawable.red_light_rect);


                txt1.setTextColor(Color.parseColor("#a9a9b0"));
                txt2.setTextColor(Color.parseColor("#a9a9b0"));
                txt3.setTextColor(Color.parseColor("#f34949"));
                break;


            case R.id.linear4:
                linear4.setBackgroundResource(R.drawable.red_light_rect);
                linear5.setBackgroundResource(R.drawable.gray_light_rect);
                linear6.setBackgroundResource(R.drawable.gray_light_rect);


                txt4.setTextColor(Color.parseColor("#f34949"));
                txt5.setTextColor(Color.parseColor("#a9a9b0"));
                txt6.setTextColor(Color.parseColor("#a9a9b0"));
                break;


            case R.id.linear5:
                linear4.setBackgroundResource(R.drawable.gray_light_rect);
                linear5.setBackgroundResource(R.drawable.red_light_rect);
                linear6.setBackgroundResource(R.drawable.gray_light_rect);


                txt4.setTextColor(Color.parseColor("#a9a9b0"));
                txt5.setTextColor(Color.parseColor("#f34949"));
                txt6.setTextColor(Color.parseColor("#a9a9b0"));
                break;



            case R.id.linear6:
                linear4.setBackgroundResource(R.drawable.gray_light_rect);
                linear5.setBackgroundResource(R.drawable.gray_light_rect);
                linear6.setBackgroundResource(R.drawable.red_light_rect);


                txt4.setTextColor(Color.parseColor("#a9a9b0"));
                txt5.setTextColor(Color.parseColor("#a9a9b0"));
                txt6.setTextColor(Color.parseColor("#f34949"));
                break;



            case R.id.linear7:
                linear7.setBackgroundResource(R.drawable.red_light_rect);
                linear8.setBackgroundResource(R.drawable.gray_light_rect);
                linear9.setBackgroundResource(R.drawable.gray_light_rect);


                txt7.setTextColor(Color.parseColor("#f34949"));
                txt8.setTextColor(Color.parseColor("#a9a9b0"));
                txt9.setTextColor(Color.parseColor("#a9a9b0"));
                break;



            case R.id.linear8:
                linear7.setBackgroundResource(R.drawable.gray_light_rect);
                linear8.setBackgroundResource(R.drawable.red_light_rect);
                linear9.setBackgroundResource(R.drawable.gray_light_rect);


                txt7.setTextColor(Color.parseColor("#a9a9b0"));
                txt8.setTextColor(Color.parseColor("#f34949"));
                txt9.setTextColor(Color.parseColor("#a9a9b0"));
                break;


            case R.id.linear9:
                linear7.setBackgroundResource(R.drawable.gray_light_rect);
                linear8.setBackgroundResource(R.drawable.gray_light_rect);
                linear9.setBackgroundResource(R.drawable.red_light_rect);


                txt7.setTextColor(Color.parseColor("#a9a9b0"));
                txt8.setTextColor(Color.parseColor("#a9a9b0"));
                txt9.setTextColor(Color.parseColor("#f34949"));
                break;



        }

    }
}
