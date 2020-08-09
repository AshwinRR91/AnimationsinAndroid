package com.mystartup.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloWorld;
    private TextView hiWorld;
    private boolean isHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloWorld = findViewById(R.id.txt_hello_world);
        hiWorld = findViewById(R.id.txt_hi_world);
        helloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isHelloWorld){
                    helloWorld.animate().alpha(0f).setDuration(3000);
                    hiWorld.animate().alpha(1f).setDuration(3000);
                    isHelloWorld = false;
                }
                else{


                    helloWorld.animate().alpha(1f).setDuration(3000);
                    hiWorld.animate().alpha(0f).setDuration(3000);
                    isHelloWorld = true;
                }
            }
        });




    }
}