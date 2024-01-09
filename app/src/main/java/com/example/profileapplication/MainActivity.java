package com.example.profileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    LinearLayout layout;
    ImageView btn_menu;
    RecyclerView rcvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        layout = findViewById(R.id.layout);
        btn_menu = findViewById(R.id.btn_menu);
        rcvData = findViewById(R.id.rcvData);

        layout.setVisibility(View.GONE);
        tv.setVisibility(View.GONE);


        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.VISIBLE);
                tv.setVisibility(View.VISIBLE);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.GONE);
                tv.setVisibility(View.GONE);
            }
        });
    }
}