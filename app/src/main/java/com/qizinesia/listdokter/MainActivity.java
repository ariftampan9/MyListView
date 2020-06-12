package com.qizinesia.listdokter;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMulai = findViewById(R.id.menu1);
        btnMulai.setOnClickListener(this);

        Button btnMulai2 = findViewById(R.id.menu2);
        btnMulai2.setOnClickListener(this);

        Button btnMulai3 = findViewById(R.id.menu3);
        btnMulai3.setOnClickListener(this);

        Button btnMulai4 = findViewById(R.id.menu4);
        btnMulai4.setOnClickListener(this);

        Button btnMulai5 = findViewById(R.id.menu5);
        btnMulai5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.menu1){
            Intent pilihdokter = new Intent(MainActivity.this, pilihdokter.class);
            startActivity(pilihdokter);
        }
        if (view.getId()==R.id.menu2){
            Intent pilihdokter = new Intent(MainActivity.this, pilihdokter.class);
            startActivity(pilihdokter);
        }
        if (view.getId()==R.id.menu3){
            Intent pilihdokter = new Intent(MainActivity.this, pilihdokter.class);
            startActivity(pilihdokter);
        }
        if (view.getId()==R.id.menu4){
            Intent pilihdokter = new Intent(MainActivity.this, pilihdokter.class);
            startActivity(pilihdokter);
        }
        if (view.getId()==R.id.menu5){
            Intent pilihdokter = new Intent(MainActivity.this, pilihdokter.class);
            startActivity(pilihdokter);
        }

    }
}