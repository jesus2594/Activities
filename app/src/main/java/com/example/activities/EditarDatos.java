package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_datos);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE5);

        TextView textView1 = (TextView) findViewById(R.id.tvNombre);
        TextView textView2 = (TextView) findViewById(R.id.tvFecha);
        TextView textView3 = (TextView) findViewById(R.id.tvTelefono);
        TextView textView4 = (TextView) findViewById(R.id.tvEmail);
        TextView textView5 = (TextView) findViewById(R.id.tvDescripcion);

        textView1.setText(message1);
        textView2.setText(message2);
        textView3.setText(message3);
        textView4.setText(message4);
        textView5.setText(message5);

    }

    public void editarDatos(View v){
        onBackPressed();

    }










}