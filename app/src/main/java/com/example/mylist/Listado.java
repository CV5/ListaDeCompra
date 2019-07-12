package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {
        ListView listV;
        EditText editTextItem;
        ArrayList<String> arreglo;
        ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        listV = findViewById(R.id.listXml);
        editTextItem = findViewById(R.id.editTextItem);

        arreglo = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>
                (
                Listado.this,
                android.R.layout.simple_list_item_1,
                arreglo
                );
        listV.setAdapter(arrayAdapter);
    }

    public void agregar(View view) {
        arreglo.add(editTextItem.getText().toString());
        arrayAdapter.notifyDataSetChanged();



    }
}
