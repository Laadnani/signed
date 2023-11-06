package com.laad9407.betterAtChess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoNext(View view) {
            navigateToNextActivity();
    }
    private void navigateToNextActivity() {
        Intent intent = new Intent(getApplicationContext(), Activity_3.class);
        startActivity(intent);
    }
}