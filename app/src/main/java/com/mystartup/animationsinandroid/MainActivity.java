package com.mystartup.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textHelloWorld;
    private TextView textHiWorld;
    private boolean isHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textHelloWorld = findViewById(R.id.txt_hello_world);
        textHiWorld = findViewById(R.id.txt_hi_world);
        textHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isHelloWorld){
                    textHelloWorld.animate().alpha(0.0f).setDuration(3000);
                    textHiWorld.animate().alpha(1.0f).setDuration(3000);
                    isHelloWorld= false;
                }
                else{
                    textHelloWorld.animate().alpha(1.0f).setDuration(3000);
                    textHiWorld.animate().alpha(0.0f).setDuration(3000);
                    isHelloWorld= true;

                }
            }
        });
    }
}