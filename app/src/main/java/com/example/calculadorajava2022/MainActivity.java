package com.example.calculadorajava2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Declaración de variables
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;

    private TextView text_resultado;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Asociación de  los atributos dependiendo de lo que tenemos en el lanyout
        text_resultado = findViewById(R.id.resultado);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);


// Asignacion a cada botón

        btn_suma=findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              text_resultado.setText( suma(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });


        btn_resta=findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_resultado.setText( resta(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_division=findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_resultado.setText( division(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_multiplicacion=findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_resultado.setText( multiplicacion(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });


    }
    //Función para cada operación

    public int suma ( int a  , int b ){
        return a+b;
    }
    public int resta ( int a  , int b ){
        return a-b;
    }
    public int division ( int a  , int b ){
        return a/b;
    }
    public int multiplicacion ( int a  , int b ){
        return a*b;
    }
}