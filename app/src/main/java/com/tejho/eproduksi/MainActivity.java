package com.tejho.eproduksi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DateActivity dateActivity;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewDate = findViewById(R.id.tanggal);
        dateActivity = new DateActivity();
        DateActivity.setDate(textViewDate);

        ImageButton btnNext = findViewById(R.id.right_btn);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateActivity.nextDay();
                DateActivity.setDate(textViewDate);
            }
        });
        ImageButton btnPrev = findViewById(R.id.left_btn);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateActivity.prevDay();
                DateActivity.setDate(textViewDate);
            }
        });
        ImageButton btnAdd1 = findViewById(R.id.add_btn1);
        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProduksiFragment produksiFragment = new ProduksiFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.home, produksiFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        ImageButton btnEdit1 = findViewById(R.id.edit_btn1);
        btnEdit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit1Fragment edit1Fragment = new Edit1Fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.home, edit1Fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        ImageButton btnAdd2 = findViewById(R.id.add_btn2);
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReworkFragment reworkFragment = new ReworkFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.home, reworkFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        ImageButton btnEdit2 = findViewById(R.id.edit_btn2);
        btnEdit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit2Fragment edit2Fragment = new Edit2Fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.home, edit2Fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


    }
}








