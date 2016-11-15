package com.chatton.marina.holdall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showToastBtn = (Button) findViewById(R.id.test1);
        showToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click!", Toast.LENGTH_SHORT).show();
            }
        });

        Button picassoBtn = (Button) findViewById(R.id.test2);
        picassoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PicassoActivity.class);
                startActivity(intent);
            }
        });
    }
}
