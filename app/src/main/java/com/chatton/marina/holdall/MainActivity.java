package com.chatton.marina.holdall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chatton.marina.holdall.fragments.FragmentsActivity;
import com.chatton.marina.holdall.list.ListActivity;
import com.chatton.marina.holdall.list2.List2Activity;
import com.chatton.marina.holdall.palindrome.PalindromeActivity;
import com.chatton.marina.holdall.picasso.PicassoActivity;

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

        Button palindromeBtn = (Button) findViewById(R.id.test3);
        palindromeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PalindromeActivity.class);
                startActivity(intent);
            }
        });

        Button listBtn = (Button) findViewById(R.id.test4);
        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        Button list2Btn = (Button) findViewById(R.id.test5);
        list2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, List2Activity.class);
                startActivity(intent);
            }
        });

        Button fragmentBtn = (Button) findViewById(R.id.test6);
        fragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentsActivity.class);
                startActivity(intent);
            }
        });
    }
}
