package com.example.sistemas.calculonotas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    private EditText edtTN1M1,edtTN2M1,editM3N1,edtTN1M2,edtTN2M2,edtTN3M2,edtTN1M3,edtTN2M3,edtTN3M3;

    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SharedPreferences prefe1=getSharedPreferences("Desarrollo", Context.MODE_PRIVATE);
        edtTN1M1 =(EditText)findViewById(R.id.edTN1M1);
        edtTN1M1.setText(prefe1.getString("a","0"));
        edtTN2M1 =(EditText)findViewById(R.id.edTN2M1);
        edtTN2M1.setText(prefe1.getString("b","0"));
        editM3N1 =(EditText)findViewById(R.id.editM3N1);
        editM3N1.setText(prefe1.getString("c","0"));
        txt1=(TextView)findViewById(R.id.txt1);
        txt1.setText(prefe1.getString("resultado","0"));
        edtTN1M1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence , int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {

                    SharedPreferences prefe1 = getSharedPreferences("Desarrollo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefe1.edit();
                    String t11=edtTN1M1.getText().toString();
                    editor.putString("a", edtTN1M1.getText().toString());
                    String t12=edtTN2M1.getText().toString();
                    String t13=editM3N1.getText().toString();

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);

                    double cal=(((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt1.setText(resul);
                } catch (Exception e) {

                }

            }
        });

        edtTN2M1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=edtTN1M1.getText().toString();
                    String t12=edtTN2M1.getText().toString();
                    editor.putString("b", edtTN2M1.getText().toString());
                    String t13=editM3N1.getText().toString();

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);

                    double cal=(((n11+n12)/2)*0.6)+(n13*0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt1.setText(resul);
                } catch (Exception e) {

                }}

        });
        editM3N1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=edtTN1M1.getText().toString();
                    String t12=edtTN2M1.getText().toString();
                    String t13=editM3N1.getText().toString();
                    editor.putString("c", edtTN2M1.getText().toString());

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);

                    double cal=(((n11+n12)/2)*0.6)+(n13*0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resulado", resul);

                    editor.commit();
                    txt1.setText(resul);
                } catch (Exception e) {

                }}

        });

// MATERIA MATEMATICAS

        SharedPreferences prefe2=getSharedPreferences("Matematicas", Context.MODE_PRIVATE);
        edtTN1M2=(EditText) findViewById(R.id.edTN1M2);
        edtTN1M2.setText(prefe2.getString("d","0"));
        edtTN2M2=(EditText) findViewById(R.id.edTN2M2);
        edtTN2M2.setText(prefe2.getString("e","0"));
        edtTN3M2=(EditText) findViewById(R.id.edTN3M2);
        edtTN3M2.setText(prefe2.getString("f" ,"0"));
        txt2=(TextView)findViewById(R.id.txt2);
        txt2.setText(prefe2.getString("resultado","0"));
        edtTN1M2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {


                try {
                    SharedPreferences preferencias = getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    String t31 = edtTN1M2.getText().toString();
                    editor.putString("d", edtTN1M2.getText().toString());
                    String t32 = edtTN2M2.getText().toString();
                    editor.putString("e", edtTN2M2.getText().toString());
                    String t33 = edtTN3M2.getText().toString();
                    editor.putString("f", edtTN3M2.getText().toString());

                    double n31 = Double.valueOf(t31);
                    double n32 = Double.valueOf(t32);
                    double n33 = Double.valueOf(t33);

                    double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                    String resul = Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt2.setText(resul);
                } catch (Exception e) {

                }
            }
        });
        edtTN2M2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try{
                    SharedPreferences preferencias=getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();
                    String t31=edtTN1M2.getText().toString();
                    editor.putString("d", edtTN1M2.getText().toString());
                    String t32=edtTN2M2.getText().toString();
                    editor.putString("e", edtTN2M2.getText().toString());
                    String t33=edtTN3M2.getText().toString();
                    editor.putString("f", edtTN3M2.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    double cal=(((n31+n32)/2)*0.6)+(n33*0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt2.setText(resul);
                } catch (Exception e) {

                }}
        });
        edtTN3M2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    SharedPreferences preferencias=getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();
                    String t31=edtTN1M2.getText().toString();
                    editor.putString("p", edtTN1M2.getText().toString());
                    String t32=edtTN2M2.getText().toString();
                    editor.putString("s", edtTN2M2.getText().toString());
                    String t33=edtTN3M2.getText().toString();
                    editor.putString("t", edtTN3M2.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    double cal=(((n31+n32)/2)*0.6)+(n33 *0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt2.setText(resul);
                } catch (Exception e) {

                }}
        });

// Materia Ingenieria Software

        SharedPreferences prefe3=getSharedPreferences("Ingenieria", Context.MODE_PRIVATE);
        edtTN1M3=(EditText) findViewById(R.id.edTN1M3);
        edtTN1M3.setText(prefe3.getString("g" ,"0"));
        edtTN2M3=(EditText) findViewById(R.id.edTN2M3);
        edtTN2M3.setText(prefe3.getString("h","0"));
        edtTN3M3=(EditText) findViewById(R.id.edTN3M3);
        edtTN3M3.setText(prefe3.getString("i","0"));
        txt3=(TextView)findViewById(R.id.txt3);
        txt3.setText(prefe3.getString("resultado","0"));

        edtTN1M3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();

                    String t31=edtTN1M3.getText().toString();
                    editor.putString("p", edtTN1M3.getText().toString());

                    String t32=edtTN2M3.getText().toString();
                    editor.putString("s", edtTN2M3.getText().toString());

                    String t33=edtTN3M3.getText().toString();
                    editor.putString("t", edtTN3M3.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    double cal=(((n31+n32)/2)*0.6)+(n33*0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt3.setText(resul);
                } catch (Exception e) {

                }}

        });
        edtTN2M3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();

                    String t31=edtTN1M3.getText().toString();
                    editor.putString("p", edtTN1M3.getText().toString());

                    String t32=edtTN2M3.getText().toString();
                    editor.putString("s", edtTN2M3.getText().toString());

                    String t33=edtTN3M3.getText().toString();
                    editor.putString("t", edtTN3M3.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    double cal=(((n31+n32)/2)*0.6)+(n33*0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt3.setText(resul);
                } catch (Exception e) {

                }}

        });

        edtTN3M3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();

                    String t31=edtTN1M3.getText().toString();
                    editor.putString("p", edtTN1M3.getText().toString());

                    String t32=edtTN2M3.getText().toString();
                    editor.putString("s", edtTN2M3.getText().toString());

                    String t33=edtTN3M3.getText().toString();
                    editor.putString("t", edtTN3M3.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    double cal=(((n31+n32)/2)*0.6)+(n33*0.4);
                    String resul=Double.toString(cal);
                    editor.putString("resultado", resul);

                    editor.commit();
                    txt3.setText(resul);
                } catch (Exception e) {

                }}

        });

    }
    public void Total(View v){

        String t1 =txt1.getText().toString();
        String t2 =txt2.getText().toString();
        String t3 =txt3.getText().toString();
        double n1 =0;
        double n2 =0;
        double n3 =0;

        n1 = Double.valueOf(t1);
        n2 = Double.valueOf(t2);
        n3 = Double.valueOf(t3);

        double total = (n1+ n2+ n3) / 3;

        Toast notificacion = Toast.makeText(this,"El promedio Total de todas las materias es"+" "+String.format("%.2f",total), Toast.LENGTH_LONG);
        notificacion.show();
    }


    public void acercade(View view) {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }


}