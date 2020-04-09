package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollbutton =(Button)findViewById(R.id.rollbutton);
        final ImageView leftdiceimage= (ImageView) findViewById(R.id.leftdice);
        final ImageView rightdiceimage =(ImageView) findViewById(R.id.rightdice);

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int dicearray[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice5, R.drawable.dice5,
                        R.drawable.dice3, R.drawable.dice4};
                Random randomenumbergenerator = new Random();

                int number= randomenumbergenerator.nextInt(6);
                Log.d("dicee", "The button clicked is   "+ number);

                leftdiceimage.setImageResource(dicearray[number]);

                number=randomenumbergenerator.nextInt(6);
                rightdiceimage.setImageResource(dicearray[number]);



            }
        });
    }
}
