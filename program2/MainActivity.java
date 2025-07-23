package com.example.program2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button openSecondActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "MainActivity: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "MainActivity: onCreate()");

        openSecondActivityButton = findViewById(R.id.openSecondActivityButton);
        openSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "MainActivity: onStart()", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "MainActivity: onResume()", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "MainActivity: onPause()", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "MainActivity: onStop()", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "MainActivity: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "MainActivity: onDestroy()");
    }
}
