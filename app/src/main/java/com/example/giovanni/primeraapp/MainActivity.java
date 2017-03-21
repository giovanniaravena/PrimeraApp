package com.example.giovanni.primeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextNombreUsuario)
    EditText editText;

    @OnClick(R.id.button_listo)
    public void buttonListo(){
        String nombreUsuario = String.valueOf(editText.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onPause() {
        super.onPause();
    }
}
