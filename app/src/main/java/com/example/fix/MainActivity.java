package com.example.fix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SetterGetter> datamenu;
    GridLayoutManager gridLayoutManager;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.review);
        addData();
        gridLayoutManager =new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter=new Adapter(datamenu);
        recyclerView.setAdapter(adapter);

    }

    public void addData(){
        datamenu=new ArrayList<>();
        datamenu.add(new SetterGetter("E-Book","ebook"));
        datamenu.add(new SetterGetter("Jual Beli Rumah","house"));
        datamenu.add(new SetterGetter("Pulsa","pulsa"));
        datamenu.add(new SetterGetter("Listrik","listrik"));
        datamenu.add(new SetterGetter("Sewa Sepeda","bicycle"));
        datamenu.add(new SetterGetter("Ticket","quit"));

    }
}