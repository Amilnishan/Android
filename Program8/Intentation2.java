//MainActivity2

package com.example.intentation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Intentation2 extends AppCompatActivity {

TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentation2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

    Bundle extra = getIntent().getExtras();
    String text = extra.getString("name");
    String text1 = extra.getString("name1");
    textView.setText(text);
    textView2.setText(text1);

    }
}