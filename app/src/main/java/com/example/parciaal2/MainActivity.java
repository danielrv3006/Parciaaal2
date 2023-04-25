package com.example.parciaal2.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View txt_numero;
    TextView txt_resultado;
    Button btn_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_numero = findViewById(R.id.txt_numero);
        txt_resultado = findViewById(R.id.txt_resultado);
        btn_resultado = findViewById(R.id.btn_iniciar);

        btn_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resultado.setText(new fibo(txt_numero) + "");
            }
        });
    }
}
