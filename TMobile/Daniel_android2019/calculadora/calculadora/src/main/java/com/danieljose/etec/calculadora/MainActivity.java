package com.danieljose.etec.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //atributos
    private EditText num1;
    private EditText num2;
    private TextView resultado;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//ligação entre a activity main e a mainactivity

        //ligação entre o java e o xml
        num1 = (EditText)findViewById(R.id.editTextNum1);
        num2 = (EditText)findViewById(R.id.editTextNum2);
        resultado = (TextView)findViewById(R.id.textViewResultado);


    }//fim do onCreate

    public void soma(View view) {

        if(eValido(this.num1, this.num2) ){
            //1. receber os valores da tela
            double num1 = Double.parseDouble(this.num1.getText().toString());
            double num2 = Double.parseDouble(this.num2.getText().toString());

            //2. realizar o calculo
            double resultado = num1 + num2;

            //3. mostrar o resultado
            this.resultado.setText(String.valueOf(resultado));

        }//fim do if de validação

    }//fim do método

    public void subtração(View view){

        if(eValido(this.num1, this.num2) ) {
            //1. receber os valores da tela
            double num1 = Double.parseDouble(this.num1.getText().toString());
            double num2 = Double.parseDouble(this.num2.getText().toString());

            //2. realizar o calculo
            double resultado = num1 - num2;

            //3. mostrar o resultado
            this.resultado.setText(String.valueOf(resultado));

        }//fim do if de validação

    }//fim do btnSub

    public void multiplicação(View view){

        if(eValido(this.num1, this.num2) ) {
            //1. receber os valores da tela
            double num1 = Double.parseDouble(this.num1.getText().toString());
            double num2 = Double.parseDouble(this.num2.getText().toString());

            //2. realizar o calculo
            double resultado = num1 * num2;

            //3. mostrar o resultado
            this.resultado.setText(String.valueOf(resultado));

        }//fim do if de validação

    }//fim do btnMult

    public void divizao(View view){

        if(eValido(this.num1, this.num2) ) {
            //1. receber os valores da tela
            double num1 = Double.parseDouble(this.num1.getText().toString());
            double num2 = Double.parseDouble(this.num2.getText().toString());

            //2. realizar o calculo
            double resultado = num1 / num2;

            //3. mostrar o resultado
            this.resultado.setText(String.valueOf(resultado));

        }//fim do if de validação

    }//fim do metodo btnDiv

    private boolean eValido(EditText num1, EditText num2){

        //declarando variavel
        boolean valido = true;

        if(num1.getText().toString().equals("")){
            //exibir a msg de erro
           num1.setError(getString(R.string.erroNullNum));

            //coloca o cursor na editText
            num1.requestFocus();
            //alterar o valor do retorno do método
            valido = false;
        }
        else if(num2.getText().toString().equals("")){
            //exibir a msg de erro
            num2.setError(getString(R.string.erroNullNum));

            //coloca o cursor na editText
            num2.requestFocus();
            //alterar o valor do retorno do método
            valido = false;

        }

        return valido;
    }//fim do metodo eValido

    public void btnlimpar(View view){
        this.num1.setText("");
        this.num2.setText("");
        this.resultado.setText("0");
    }



}//fim da classe
