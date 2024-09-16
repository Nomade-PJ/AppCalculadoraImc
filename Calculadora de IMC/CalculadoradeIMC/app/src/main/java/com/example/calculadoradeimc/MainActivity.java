package com.example.calculadoradeimc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private TextView editepeso;
    private TextView editealtura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textresultado);
        editepeso = findViewById(R.id.editepeso);
        editealtura = findViewById(R.id.editealtura);


    }

    public void calcular(View view){

        double peso = Double.parseDouble(editepeso.getText().toString());
        double altura = Double.parseDouble(editealtura.getText().toString());
        double resultado = peso / (altura * altura);

        //se
        if(resultado < 18.5){
            textResultado.setText("Abaixo do peso");
            
        } else if (resultado <= 18.5 && resultado <= 24.9){
            textResultado.setText("Peso normal");

        } else if (resultado <= 25 && resultado <= 29.9){
            textResultado.setText("Sobrepeso");


        } else if (resultado <= 30 && resultado <= 39.9){
            textResultado.setText("Obesidade");

        } else if (resultado >= 40){
            textResultado.setText("Obesidade grave");
            
        }


    }
}
