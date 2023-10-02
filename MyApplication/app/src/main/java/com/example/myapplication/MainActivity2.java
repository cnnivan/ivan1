package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void SiguienteP(View v){
        Intent sigP = new Intent(this,MainActivity3.class);
        startActivity(sigP);
    }

    public void SiguienteN(View v){
        Intent sigN = new Intent(this,MainActivity5.class);
        startActivity(sigN);
    }
}