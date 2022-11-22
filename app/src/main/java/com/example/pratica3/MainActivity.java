package com.example.pratica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private BreakIterator campoTexto;
    private EditText edProduto;
    private EditText edtPreço;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edProduto = (EditText) findViewById(R.id.edProduto);
        edtPreço = (EditText) findViewById(R.id.edPreço);


    }
    public void mostraTexto (View view) {
        // Recupera o texto digitado
        to

    }
}