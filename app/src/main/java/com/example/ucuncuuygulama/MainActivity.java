package com.example.ucuncuuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnGiris;
    private EditText txtKullaniciAdi,txtSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"HOŞ GELDİNİZ",Toast.LENGTH_LONG).show();

        btnGiris=(Button)findViewById(R.id.btnGiris);
        txtKullaniciAdi=(EditText)findViewById(R.id.txtKullaniciAdi);
        txtSifre=(EditText)findViewById(R.id.txtSifre);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
              String userID=txtKullaniciAdi.getText().toString();
              String password=txtSifre.getText().toString();
                try{
                if(userID.equals("admin") && password.equals("123")){
                    Toast.makeText(getApplicationContext(),"Giriş Yaptınız!",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                   startActivity(intent);
                }
                else{
                    txtKullaniciAdi.setError("Hatalı Kullanıcı Adı");
                    txtSifre.setError("Hatalı Şifre");
                }}
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Hata",Toast.LENGTH_LONG).show();
                }
          }
        });


    }
}