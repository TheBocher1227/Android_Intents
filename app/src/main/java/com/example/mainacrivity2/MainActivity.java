

package com.example.mainacrivity2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }

        });



        TextView text2;
        btn1 = (Button) findViewById(R.id.btn1);
        text2 = (TextView) findViewById(R.id.text2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(3000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        int counter =(int) millisUntilFinished/1000 ;
                        text2.setText(String.valueOf(counter));
                        counter++;
                    }
                    public void onFinish() {
                        text2.setText("YA!!");
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);


                    }
                }.start();
            }
        });


    }
}