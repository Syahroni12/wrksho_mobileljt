package com.example.wsandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private mhs_adaptor mhsAdaptor;
private ArrayList<mhs_model>mhsModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getData();
        
        recyclerView=findViewById(R.id.rscview);
        mhsAdaptor=new mhs_adaptor(mhsModels);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsAdaptor);
    }

    private void getData() {
mhsModels=new ArrayList<>();
mhsModels.add(new mhs_model("Muhammad Syahroni",R.drawable.roni));
mhsModels.add(new mhs_model("ratna amelia",R.drawable.ratna));
mhsModels.add(new mhs_model("nur atika",R.drawable.tik));
mhsModels.add(new mhs_model("Umi alya ayu adhiba",R.drawable.adb));
mhsModels.add(new mhs_model("hairul anam",R.drawable.irl));

    }
}