package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listado extends AppCompatActivity {
        ListView listView;
        String[] list = {"jamon","Queso","Tomate","Cafe"};
        ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        listView = findViewById(R.id.listado);
        listView.setAdapter(arrayAdapter);

    }
}
