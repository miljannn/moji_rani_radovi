package com.example.code.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonPrvi = findViewById(R.id.prvo_dugme);
        final Button buttonDrugi = findViewById(R.id.drugo_dugme);
        final Button buttonTreci = findViewById(R.id.trece_dugme);
        final EditText zbirEditText = findViewById(R.id.zbir);
        final EditText nasumicanBrojEditText = findViewById(R.id.nasumican_broj);
        buttonPrvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
