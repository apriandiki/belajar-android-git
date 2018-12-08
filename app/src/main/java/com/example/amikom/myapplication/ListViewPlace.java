package com.example.amikom.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewPlace extends AppCompatActivity {
    String[] listArray={"Number 1","Number 2","Number 3","Number 4","Number 5",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("ListView");
        setContentView(R.layout.activity_list_view_place);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_list_view,listArray);
        ListView listview =(ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);
    }
}
