package com.example.country_guesser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView flag=i1;
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ImageView flag1 = flag;
                    flag1= true;

                }
            });
                b1=findViewById(R.id.button);
                i1=(ImageView)findViewById(R.id.zim);
                i1.setImageDrawable(getResources().getDrawable(R.drawable.img));





                {
                }

            }

    }
}