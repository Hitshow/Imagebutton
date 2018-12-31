package com.example.a.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    int x;
    ImageButton ib;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = (ImageButton) findViewById(R.id.ib);
        iv = (ImageView) findViewById(R.id.iv);
    }
    public void picswitch(View view) {
        x = rnd.nextInt(3) + 1;
        switch (x) {
            case 1:iv.setImageResource(R.drawable.one);
                   ib.setImageResource(R.drawable.oneb);break;
            case 2:iv.setImageResource(R.drawable.two);
                   ib.setImageResource(R.drawable.twob);break;
            case 3:iv.setImageResource(R.drawable.three);
                   ib.setImageResource(R.drawable.threeb);break;


        }
    }
}
