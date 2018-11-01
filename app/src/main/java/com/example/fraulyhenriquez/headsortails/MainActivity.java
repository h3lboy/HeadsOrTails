package com.example.fraulyhenriquez.headsortails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btnFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img = (ImageView) findViewById(R.id.imageView);
        btnFlip = (Button) findViewById(R.id.btn_Click);




    }

    public void Btn_Click (View v) {


        Random randCoins = new Random();
        int Coinsflip = randCoins.nextInt(2) + 1;

        switch (Coinsflip) {
            case 1:

                img.setImageResource(R.drawable.heads);


                break;

            case 2:


                img.setImageResource(R.drawable.tails);
                break;


        }
    }

}