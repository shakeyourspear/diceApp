package com.shakeyourspear.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArry = {
                R.mipmap.dice1,
                R.mipmap.dice2,
                R.mipmap.dice3,
                R.mipmap.dice4,
                R.mipmap.dice5,
                R.mipmap.dice6,

        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "This Button has been pressed!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                Log.d("Dicee", "The Random number is: " + number);

                leftDice.setImageResource(diceArry[number]);

                number = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArry[number]);
            }
        });
    }
}
