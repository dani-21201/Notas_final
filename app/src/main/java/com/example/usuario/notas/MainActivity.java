package com.example.usuario.notas;

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

    private EditText t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    private TextView d1, d2, d3, d4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
        t3 = (EditText) findViewById(R.id.t3);
        t4 = (EditText) findViewById(R.id.t4);
        t5 = (EditText) findViewById(R.id.t5);
        t6 = (EditText) findViewById(R.id.t6);
        t7 = (EditText) findViewById(R.id.t7);
        t8 = (EditText) findViewById(R.id.t8);
        t9 = (EditText) findViewById(R.id.t9);
        t10 = (EditText) findViewById(R.id.t10);
        t11 = (EditText) findViewById(R.id.t11);
        t12 = (EditText) findViewById(R.id.t12);
        d1 = (TextView) findViewById(R.id.d1);
        d2 = (TextView) findViewById(R.id.d2);
        d3 = (TextView) findViewById(R.id.d3);
        d4 = (TextView) findViewById(R.id.d4);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        t1.setText(prefe.getString("nota1", "0"));
        t2.setText(prefe.getString("nota2", "0"));
        t3.setText(prefe.getString("nota3", "0"));
        t4.setText(prefe.getString("nota4", "0"));
        t5.setText(prefe.getString("nota5", "0"));
        t6.setText(prefe.getString("nota6", "0"));
        t7.setText(prefe.getString("nota7", "0"));
        t8.setText(prefe.getString("nota8", "0"));
        t9.setText(prefe.getString("nota9", "0"));
        t10.setText(prefe.getString("nota10", "0"));
        t11.setText(prefe.getString("nota11", "0"));
        t12.setText(prefe.getString("nota12", "0"));
        d1.setText(prefe.getString("resu1", d1.getText().toString()));
        d2.setText(prefe.getString("resu2", d2.getText().toString()));
        d3.setText(prefe.getString("resu3", d3.getText().toString()));
        d4.setText(prefe.getString("resu4", d4.getText().toString()));


//comentario
//puevv


            t1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {

                        String nota1 = t1.getText().toString();
                        String nota2 = t2.getText().toString();
                        String nota3 = t3.getText().toString();
                        float nro1 = Float.parseFloat(nota1);
                        float nro2 = Float.parseFloat(nota2);
                        float nro3 = Float.parseFloat(nota3);
                        if(nro1<=5 && nro1>=0){
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));

                        String resultado1 = String.valueOf(resumat1);
                        d1.setText(resultado1);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota1", t1.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,getResources().getString(R.string.cero), Toast.LENGTH_LONG);
                            notificacion.show();
                            d1.setText(getResources().getString(R.string.error));
                        }
                    } catch (Exception e) {
                        if (t1.getText().toString().equals("") || t2.getText().toString().equals("") || t3.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }

                    }}

            });
            t2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {

                        String nota1 = t1.getText().toString();
                        String nota2 = t2.getText().toString();
                        String nota3 = t3.getText().toString();
                        float nro1 = Float.parseFloat(nota1);
                        float nro2 = Float.parseFloat(nota2);
                        float nro3 = Float.parseFloat(nota3);
                        if(nro2<=5 && nro2>=0 ){
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));

                            String resultado1 = String.valueOf(resumat1);
                            d1.setText(resultado1);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota2", t2.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,getResources().getString(R.string.cero), Toast.LENGTH_LONG);
                            notificacion.show();
                            d1.setText(getResources().getString(R.string.error));
                        }
                    } catch (Exception e) {
                        if (t1.getText().toString().equals("") || t2.getText().toString().equals("") || t3.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }

                    }}

            });

            t3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {

                        String nota1 = t1.getText().toString();
                        String nota2 = t2.getText().toString();
                        String nota3 = t3.getText().toString();
                        float nro1 = Float.parseFloat(nota1);
                        float nro2 = Float.parseFloat(nota2);
                        float nro3 = Float.parseFloat(nota3);
                        if( nro3<=5 && nro3>=0){
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));

                            String resultado1 = String.valueOf(resumat1);
                            d1.setText(resultado1);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota3", t3.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,getResources().getString(R.string.cero), Toast.LENGTH_LONG);
                            notificacion.show();
                            d1.setText(getResources().getString(R.string.error));
                        }
                    } catch (Exception e) {
                        if (t1.getText().toString().equals("") || t2.getText().toString().equals("") || t3.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }

                    }}

            });

            t4.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota4 = t4.getText().toString();
                        String nota5 = t5.getText().toString();
                        String nota6 = t6.getText().toString();
                        float nro1 = Float.parseFloat(nota4);
                        float nro2 = Float.parseFloat(nota5);
                        float nro3 = Float.parseFloat(nota6);
                        if (nro1 <= 5 && nro1 >= 0) {
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));

                            String resultado2 = String.valueOf(resumat1);
                            d2.setText(resultado2);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota4", t4.getText().toString());
                            editor.commit();
                        } else {
                            Toast notificacion = Toast.makeText(MainActivity.this,getResources().getString(R.string.cero), Toast.LENGTH_LONG);
                            notificacion.show();
                            d2.setText(getResources().getString(R.string.error));
                        }
                    }
                    catch (Exception e) {
                        if (t4.getText().toString().equals("") || t5.getText().toString().equals("") || t6.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}
            });

            t5.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota4 = t4.getText().toString();
                        String nota5 = t5.getText().toString();
                        String nota6 = t6.getText().toString();
                        float nro1 = Float.parseFloat(nota4);
                        float nro2 = Float.parseFloat(nota5);
                        float nro3 = Float.parseFloat(nota6);
                        if (nro2 <= 5 && nro2 >= 0)  {
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));

                            String resultado2 = String.valueOf(resumat1);
                            d2.setText(resultado2);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota5", t5.getText().toString());
                            editor.commit();
                        } else {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d2.setText(getResources().getString(R.string.error));
                        }
                    }
                    catch (Exception e) {
                        if (t4.getText().toString().equals("") || t5.getText().toString().equals("") || t6.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}
            });

            t6.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota4 = t4.getText().toString();
                        String nota5 = t5.getText().toString();
                        String nota6 = t6.getText().toString();
                        float nro1 = Float.parseFloat(nota4);
                        float nro2 = Float.parseFloat(nota5);
                        float nro3 = Float.parseFloat(nota6);
                        if (nro3 <= 5 && nro3 >= 0)  {
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));

                            String resultado2 = String.valueOf(resumat1);
                            d2.setText(resultado2);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota6", t6.getText().toString());
                            editor.commit();
                        } else {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d2.setText(getResources().getString(R.string.error));
                        }
                    }
                    catch (Exception e) {
                        if (t4.getText().toString().equals("") || t5.getText().toString().equals("") || t6.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}
            });
            t7.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                    String nota7 = t7.getText().toString();
                    String nota8 = t8.getText().toString();
                    String nota9 = t9.getText().toString();
                    float nro1 = Float.parseFloat(nota7);
                    float nro2 = Float.parseFloat(nota8);
                    float nro3 = Float.parseFloat(nota9);
                        if (nro1 <= 5 && nro1 >= 0)  {
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));
                        String resultado3 = String.valueOf(resumat1);
                        d3.setText(resultado3);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota7", t7.getText().toString());
                            editor.commit();
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                        notificacion.show();
                        d3.setText(getResources().getString(R.string.error));
                    }}
                    catch (Exception e) {
                        if (t7.getText().toString().equals("") || t8.getText().toString().equals("") || t9.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}

            });
            t8.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota7 = t7.getText().toString();
                        String nota8 = t8.getText().toString();
                        String nota9 = t9.getText().toString();
                        float nro1 = Float.parseFloat(nota7);
                        float nro2 = Float.parseFloat(nota8);
                        float nro3 = Float.parseFloat(nota9);
                        if (nro2 <= 5 && nro2 >= 0)  {
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));
                            String resultado3 = String.valueOf(resumat1);
                            d3.setText(resultado3);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota8", t8.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d3.setText(getResources().getString(R.string.error));
                        }

                    }
                    catch (Exception e) {
                        if (t7.getText().toString().equals("") || t8.getText().toString().equals("") || t9.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}

            });
            t9.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota7 = t7.getText().toString();
                        String nota8 = t8.getText().toString();
                        String nota9 = t9.getText().toString();
                        float nro1 = Float.parseFloat(nota7);
                        float nro2 = Float.parseFloat(nota8);
                        float nro3 = Float.parseFloat(nota9);
                        if (nro3 <= 5 && nro3 >= 0)  {
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));
                            String resultado3 = String.valueOf(resumat1);
                            d3.setText(resultado3);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota9", t9.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d3.setText(getResources().getString(R.string.error));
                        }


                    }
                    catch (Exception e) {
                        if (t7.getText().toString().equals("") || t8.getText().toString().equals("") || t9.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}

            });
            t10.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                    String nota10 = t10.getText().toString();
                    String nota11 = t11.getText().toString();
                    String nota12 = t12.getText().toString();
                    float nro1 = Float.parseFloat(nota10);
                    float nro2 = Float.parseFloat(nota11);
                    float nro3 = Float.parseFloat(nota12);
                        if (nro1 <= 5 && nro1 >= 0){
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));
                    String resultado4 = String.valueOf(resumat1);
                    d4.setText(resultado4);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota10", t10.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d4.setText(getResources().getString(R.string.error));
                        }
                }
                    catch (Exception e) {
                        if (t10.getText().toString().equals("") || t11.getText().toString().equals("") || t12.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}
            });

            t11.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota10 = t10.getText().toString();
                        String nota11 = t11.getText().toString();
                        String nota12 = t12.getText().toString();
                        float nro1 = Float.parseFloat(nota10);
                        float nro2 = Float.parseFloat(nota11);
                        float nro3 = Float.parseFloat(nota12);
                        if (nro2 <= 5 && nro2 >= 0){
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));
                            String resultado4 = String.valueOf(resumat1);
                            d4.setText(resultado4);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota11", t11.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d4.setText(getResources().getString(R.string.error));
                        }
                    }
                    catch (Exception e) {
                        if (t10.getText().toString().equals("") || t11.getText().toString().equals("") || t12.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}
            });
            t12.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String nota10 = t10.getText().toString();
                        String nota11 = t11.getText().toString();
                        String nota12 = t12.getText().toString();
                        float nro1 = Float.parseFloat(nota10);
                        float nro2 = Float.parseFloat(nota11);
                        float nro3 = Float.parseFloat(nota12);
                        if (nro3 <= 5 && nro3 >= 0){
                            float resumat1 = ((float)((((nro1 + nro2) / 2) * 0.6) + (nro3 * 0.4)));
                            String resultado4 = String.valueOf(resumat1);
                            d4.setText(resultado4);
                            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("nota12", t12.getText().toString());
                            editor.commit();
                        }
                        else
                        {
                            Toast notificacion = Toast.makeText(MainActivity.this,"numero entre 1 y 5", Toast.LENGTH_LONG);
                            notificacion.show();
                            d4.setText(getResources().getString(R.string.error));
                        }
                    }
                    catch (Exception e) {
                        if (t10.getText().toString().equals("") || t11.getText().toString().equals("") || t12.getText().toString().equals("") ) {
                            Toast notificacion = Toast.makeText(MainActivity.this, getResources().getString(R.string.rellenar), Toast.LENGTH_LONG);
                            notificacion.show();
                        }}}
            });
        }

    public void operar(View view) {
        String resultado1 = d1.getText().toString();
        String resultado2 = d2.getText().toString();
        String resultado3 = d3.getText().toString();
        String resultado4 = d4.getText().toString();
        double nro1 = Double.parseDouble(resultado1);
        double nro2 = Double.parseDouble(resultado2);
        double nro3 = Double.parseDouble(resultado3);
        double nro4 = Double.parseDouble(resultado4);
        float resumatfin =(float) ((nro1 + nro2 + nro3 + nro4) / 4);
        Toast notificacion = Toast.makeText(this, getResources ().getString(R.string.dif)+" "+ resumatfin, Toast.LENGTH_LONG);
        notificacion.show();


    }

   /* public void recuperar(View view) {
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("nota1", t1.getText().toString());
        editor.putString("nota2", t2.getText().toString());
        editor.putString("nota3", t3.getText().toString());
        editor.putString("nota4", t4.getText().toString());
        editor.putString("nota5", t5.getText().toString());
        editor.putString("nota6", t6.getText().toString());
        editor.putString("nota7", t7.getText().toString());
        editor.putString("nota8", t8.getText().toString());
        editor.putString("nota9", t9.getText().toString());
        editor.putString("nota10", t10.getText().toString());
        editor.putString("nota11", t11.getText().toString());
        editor.putString("resu1", d1.getText().toString());
        editor.putString("resu2", d2.getText().toString());
        editor.putString("resu3", d3.getText().toString());
        editor.putString("resu4", d4.getText().toString());
        editor.commit();
        finish();
    }
*/
 public void denotas(View view)
 {
                Intent i = new Intent(this,not.class);
                startActivity(i);
            }
        }