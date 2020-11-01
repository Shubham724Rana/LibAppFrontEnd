package com.darko724.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_Main_2 extends AppCompatActivity {
   private ListView listView;
private ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main_2);
        LinearLayout linearLayout = new LinearLayout(this);
        listView = findViewById(R.id.main_view);
        arrayList.add("Hall 1 Seat Remaining 0");
        arrayList.add("Hall 2 Seat Remaining 0");
        arrayList.add("Hall 3 Seat Remaining 0");
        arrayList.add("Hall 4 Seat Remaining 0");
        arrayList.add("Hall 5 Seat Remaining 0");
        arrayList.add("Hall 6 Seat Remaining 0");
        ArrayAdapter arrayAdapter;
        arrayAdapter = new ArrayAdapter(this, android.R.layout.activity_list_item, arrayList);
        listView.setAdapter(arrayAdapter);
    }

}
