package com.gabriel.menulista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainHTML extends AppCompatActivity {
    TextView tvHTML;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h_t_m_l);

        tvHTML = findViewById(R.id.tvHTML);

    }
}