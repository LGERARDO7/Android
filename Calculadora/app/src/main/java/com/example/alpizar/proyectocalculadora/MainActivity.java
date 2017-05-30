package com.example.alpizar.proyectocalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText oper1,oper2,rest;
    private Button salir,limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recuperamos los objetos controles
        oper1=(EditText)findViewById(R.id.ETNum1);
        oper2=(EditText)findViewById(R.id.ETNum2);
        rest=(EditText) findViewById(R.id.ETResultado);
        limpiar=(Button)findViewById(R.id.BtnLimpiar);
        salir=(Button)findViewById(R.id.BtnSalir);
        limpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               Limpiar(v);
            }
        });
        salir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Salida(v);
            }
        });
    }

    public void sumar(View v)
    {
        String num1=oper1.getText().toString();
        String num2=oper2.getText().toString();
        if (num1.equals("")||num2.equals(""))
        {
            Toast.makeText(this, "Por favor llena los campos de numero.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            //convertimos a número los valores introducidos y operamos
            float n1=Float.parseFloat(num1);
            float n2=Float.parseFloat(num2);
            float sum=n1+n2;
            rest.setText(String.valueOf(sum));
            mostrar(sum);
        }
    }

    public void restar(View v)
    {
        String num1= oper1.getText().toString();
        String num2=oper2.getText().toString();
        if (num1.equals("")||num2.equals(""))
        {
            Toast.makeText(this, "Por favor llena todos los campos de numero.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            //convertimos a número los valores introducidos y operamos
            float n1=Float.parseFloat(num1);
            float n2=Float.parseFloat(num2);
            float res=n1-n2;
            rest.setText(String.valueOf(res));
            mostrar(res);
        }
    }

    public void multiplicar(View v)
    {
        String num1= oper1.getText().toString();
        String num2=oper2.getText().toString();
        if (num1.equals("")||num2.equals(""))
        {
            Toast.makeText(this, "Por favor llena todos los campos de numero.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            //convertimos a número los valores introducidos y operamos
            float n1=Float.parseFloat(num1);
            float n2=Float.parseFloat(num2);
            float mult=n1*n2;
            rest.setText(String.valueOf(mult));
            mostrar(mult);
        }
    }

    public void dividir(View v)
    {
        String num1= oper1.getText().toString();
        String num2=oper2.getText().toString();
        if (num1.equals("")||num2.equals(""))
        {
            Toast.makeText(this, "Por favor llena todos los campos de numero.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            //convertimos a número los valores introducidos y operamos
            float n1=Float.parseFloat(num1);
            float n2=Float.parseFloat(num2);
            float div=n1/n2;
            rest.setText(String.valueOf(div));
            mostrar(div);
        }
    }

    private void mostrar(float res)
    {
        //mostramos resultado en un Toast
        Toast.makeText(this, "Resultado: " + res, Toast.LENGTH_SHORT).show();
    }

    private void Limpiar(View v)
    {
        oper1.setText("");
        oper2.setText("");
        rest.setText("");
    }

    public void Salida(View v)
    {
        finishAffinity();
        //mostramos resultado en un Toast
        Toast.makeText(this, "Integrantes:\nAvilés Alpizar Carmen Michelle\nDe La rosa Díaz Josue David\n¡Gracias por probar nuestra aplicación!", Toast.LENGTH_LONG).show();
    }
}