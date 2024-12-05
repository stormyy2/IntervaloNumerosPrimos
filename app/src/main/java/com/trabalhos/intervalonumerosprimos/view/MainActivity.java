package com.trabalhos.intervalonumerosprimos.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.trabalhos.intervalonumerosprimos.R;
import com.trabalhos.intervalonumerosprimos.controller.controller;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private EditText txtN1;
    private EditText txtN2;
    private Button btnCalcular;
    private TextView txtErro;
    private TextView txtRes;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        controller m = new controller();

        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtErro = findViewById(R.id.txtErro);
        txtRes = findViewById(R.id.txtRes);

        btnCalcular.setOnClickListener(x -> {
            if(!m.verificaNumeroMaiorEMenor(txtN1, txtN2)){
                txtRes.setText("");
                txtErro.setText("Os números devem estar dentro do limite citado.");
                txtN1.setText("");
                txtN2.setText("");
                return;
            }
            txtErro.setText("");
            txtRes.setText(m.numerosPrimos(txtN1, txtN2));
        });


    }
}