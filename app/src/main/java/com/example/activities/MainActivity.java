package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE1 = "com.example.myfirst.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirst.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.myfirst.MESSAGE3";
    public static final String EXTRA_MESSAGE4 = "com.example.myfirst.MESSAGE4";
    public static final String EXTRA_MESSAGE5 = "com.example.myfirst.MESSAGE5";

    DatePicker picker;
    Button btnGet;
    TextView tvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker=(DatePicker)findViewById(R.id.et_fecha);
        tvw=(TextView)findViewById(R.id.tvSetFecha);

        btnGet=(Button)findViewById(R.id.boton_fecha);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvw.setText("Fecha: "+ picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());
            }
        });

    }
    public void EnviarDatos(View view){

        Intent intent = new Intent(this, EditarDatos.class);
        EditText editText1 = findViewById(R.id.et_nombre);

        EditText editText3 = findViewById(R.id.et_telefono);
        EditText editText4 = findViewById(R.id.et_email);
        EditText editText5 = findViewById(R.id.et_descripcion);



        String message1 = editText1.getText().toString();
        String message2 = tvw.getText().toString();
        String message3 = editText3.getText().toString();
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        intent.putExtra(EXTRA_MESSAGE3, message3);
        intent.putExtra(EXTRA_MESSAGE4, message4);
        intent.putExtra(EXTRA_MESSAGE5, message5);

        startActivity(intent);

    }

}