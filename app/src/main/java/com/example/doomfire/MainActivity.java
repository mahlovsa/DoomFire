package com.example.doomfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mSetOnFireButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSetOnFireButton = (Button) findViewById(R.id.set_on_fire_button);
        mSetOnFireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = FireActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }
}