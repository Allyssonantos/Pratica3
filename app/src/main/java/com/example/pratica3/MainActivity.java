package com.example.pratica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private BreakIterator campoTexto;
    private EditText edProduto;
    private EditText edPreço;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edProduto = (EditText) findViewById(R.id.edProduto);
        edPreço = (EditText) findViewById(R.id.edPreço);


    }
    public void mostraTexto (View view) {
        // Recupera o texto digitado
        Toast.makeText(MainActivity.this, "Dados informados:    Nomes do produto:"  + edProduto.getText() + "Preço do produto" + edPreço, Toast.LENGTH_LONG);

    }
}