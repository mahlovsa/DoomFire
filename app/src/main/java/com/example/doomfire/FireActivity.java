package com.example.doomfire;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flame_layout);

    }

    public static Intent newIntent(Context packageContext){
        return new Intent(packageContext, FireActivity.class);

    }
}
