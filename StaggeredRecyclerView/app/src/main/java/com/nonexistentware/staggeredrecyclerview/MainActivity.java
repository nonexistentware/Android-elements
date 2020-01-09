package com.nonexistentware.staggeredrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    StaggeredAdapter adapter;
    ArrayList<Model> models;
    StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(manager);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.photo1));
        models.add(new Model(R.drawable.photo2));
        models.add(new Model(R.drawable.photo3));
        models.add(new Model(R.drawable.photo4));
        models.add(new Model(R.drawable.photo5));
        models.add(new Model(R.drawable.photo6));
        models.add(new Model(R.drawable.photo7));
        models.add(new Model(R.drawable.photo8));

        adapter = new StaggeredAdapter(this, models);
        recyclerView.setAdapter(adapter);
    }
}
