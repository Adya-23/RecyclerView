package com.example.recyclerviewrepeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    com.example.recyclerviewrepeat.Adapter adapter;
    ArrayList<String> numberlist;
    ArrayList<String> wordslist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberlist=new ArrayList<>();
        numberlist.add("1");
        numberlist.add("2");
        numberlist.add("3");
        numberlist.add("4");
        numberlist.add("5");
        numberlist.add("6");
        numberlist.add("7");
        numberlist.add("8");
        numberlist.add("9");
        numberlist.add("10");


        wordslist=new ArrayList<>();
        wordslist.add("one");
        wordslist.add("two");
        wordslist.add("three");
        wordslist.add("four");
        wordslist.add("five");
        wordslist.add("six");
        wordslist.add("seven");
        wordslist.add("eight");
        wordslist.add("nine");
        wordslist.add("ten");



        recyclerView=findViewById(R.id.recyclelayout);
        adapter=new com.example.recyclerviewrepeat.Adapter(this,numberlist,wordslist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}
