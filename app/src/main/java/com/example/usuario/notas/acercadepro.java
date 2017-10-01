package com.example.usuario.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class acercadepro extends AppCompatActivity {
    // String aguacate=this.getString(R.string.aguacate);
    private String[] Profesores;
    private String[] Celulares = { "3144444", "2727272", "552588","312855", "319542145", "320567785"};

   /* private String[] Materia ={getString(R.string.app_moviles),getString(R.string.ing_sof),getString(R.string.proy_agiles),
            getString(R.string.seg_inf),getString(R.string.mate),getString(R.string.tes)};*/


    private ListView li1;
    private TextView tv1;
    private ImageView im;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercadepro);

        Profesores = new String[]{"Robinson ","Franklin","Edgar","juan Carlos","Janeth","Mario"};

        tv1=(TextView)findViewById(R.id.tv1);
        li1 =(ListView)findViewById(R.id.l1);
        im =(ImageView) findViewById(R.id.im);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Profesores);
        li1.setAdapter(adapter);

        li1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText(getResources().getString(R.string.numero)+"  "+ li1.getItemAtPosition(i) +"  "+(getResources().getString(R.string.is)+"  "+" "+ Celulares[i]+" "));
                im.setImageResource ((int) ((R.drawable.not)+li1.getItemIdAtPosition(i)));

            }
        });

    }

    public void finalizar(View v) {
        finish();
    }

}
