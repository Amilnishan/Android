//MainActivity

package com.example.intentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNavigate = findViewById(R.id.buttonNavigate);

        buttonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to open SecondActivity
                Intent intent = new Intent(MainActivity.this, Intentation2.class);
                intent.putExtra("name","Amil");
                intent.putExtra("name1","Shanu");
                startActivity(intent);
            }
        });
    }
}