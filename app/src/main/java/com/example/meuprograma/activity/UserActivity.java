package com.example.meuprograma.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.meuprograma.R;
import com.example.meuprograma.debug.DebugActivity;

public class UserActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}