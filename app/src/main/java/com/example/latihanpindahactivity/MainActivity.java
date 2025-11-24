package com.example.latihanpindahactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button BtnBukaSatu,BtnBukaDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        BtnBukaSatu = (Button) findViewById(R.id.BtnBukaSatu);
        BtnBukaDua = (Button) findViewById(R.id.BtnBukaDua);

        BtnBukaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActSatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(BukaActSatu);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BtnBukaDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaDua();
            }
        });
    }

    public void BukaDua(){
        Intent BukaActDua = new Intent(getApplicationContext(), DuaActivity.class);
        startActivity(BukaActDua);
    }

}