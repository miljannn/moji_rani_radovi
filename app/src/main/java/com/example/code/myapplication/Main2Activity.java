package com.example.code.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText prviBroj = findViewById(R.id.prvi_broj);
        EditText drugiBroj = findViewById(R.id.drugi_broj);
        Button saberiDugme = findViewById(R.id.saberi_button);
        prviBroj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }



}
