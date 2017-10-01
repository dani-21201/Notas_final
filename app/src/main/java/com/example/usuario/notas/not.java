package com.example.usuario.notas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class not extends AppCompatActivity {

    private String[] Materia;
    private String[] Creditos = { "8", "5","5","3","5","6"};
   /* private String[] Materia ={getString(R.string.app_moviles),getString(R.string.ing_sof),getString(R.string.proy_agiles),
            getString(R.string.seg_inf),getString(R.string.mate),getString(R.string.tes)};*/


    private ListView li1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not);
        Materia = new String[]{getString(R.string.app_moviles),getString(R.string.ing_sof),getString(R.string.proy_agiles),
                getString(R.string.seg_inf),getString(R.string.mate),getString(R.string.tes)};
        tv1=(TextView)findViewById(R.id.tv1);
        li1 =(ListView)findViewById(R.id.l1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Materia);
        li1.setAdapter(adapter);

        li1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText(getResources().getString(R.string.cantticre)+"  "+ li1.getItemAtPosition(i) +"  "+(getResources().getString(R.string.is)+"  "+" "+ Creditos[i]+" "));
                ;
            }
        });

    }



    public void acercade(View view) {
        Intent i = new Intent(this, acercadepro.class);
        startActivity(i);
    }

    public void fin(View v) {
        finish();
    }
    }

