package com.example.ucuncuuygulama;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    EditText txtNumber1,txtNumber2;
    TextView lblResult;
    @Override
    protected void onCreate(@NonNull Bundle SavedIn) {
        super.onCreate(SavedIn);
        setContentView(R.layout.activity_calculator);

        txtNumber1=(EditText) findViewById(R.id.txtNumber1);
        txtNumber2=(EditText) findViewById(R.id.txtNumber2);
        lblResult=(TextView) findViewById(R.id.lblSonuc);

    }

    public void sum(View view){

     double sayi1=  Double.parseDouble(txtNumber1.getText().toString());
     double sayi2=  Integer.parseInt(txtNumber2.getText().toString());
     double sonuc=sayi1+sayi2;
     lblResult.setText("Result: "+sonuc);

    }
    public void deduct(View view){
        double sayi1=  Double.parseDouble(txtNumber1.getText().toString());
        double sayi2=  Integer.parseInt(txtNumber2.getText().toString());
        double sonuc=sayi1-sayi2;
        lblResult.setText("Result: "+sonuc);

    }
    public void multiply(View view){
        double sayi1=  Double.parseDouble(txtNumber1.getText().toString());
        double sayi2=  Integer.parseInt(txtNumber2.getText().toString());
        double sonuc=sayi1*sayi2;
        lblResult.setText("Result: "+sonuc);

    }
    public void divide(View view){
        double sayi1=  Double.parseDouble(txtNumber1.getText().toString());
        double sayi2=  Integer.parseInt(txtNumber2.getText().toString());
        double sonuc=sayi1/sayi2;
        lblResult.setText("Result: "+sonuc);

    }
}
