package com.example.przykadowyformularz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int licznik = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        TextView textView = findViewById(R.id.text);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik++;
                textView.setText(licznik + " polubień");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(licznik > 0) {
                    licznik--;
                    textView.setText(licznik + " polubień");
                }
                else {
                    licznik = 0;
                    textView.setText(licznik + " polubień");
                }
            }
        });
    }
}