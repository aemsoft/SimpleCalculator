package com.example.ucuncuuygulama;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iki);


    }


    public void calc(View view){
        Intent intent=new Intent(getApplicationContext(),CalculatorActivity.class);
        startActivity(intent);

    }
}
