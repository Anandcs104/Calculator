package com.example.tanand3.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import adapter.CalculatorLogic;
import adapter.ItemClick;
import adapter.MyRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity implements ItemClick{

    private RecyclerView recyclerView;
    private MyRecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private CalculatorLogic calculatorLogic;
    private String Calc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        layoutManager  = new GridLayoutManager(this,3);

        String data[] = {"1","2","3","4","5","6","7","8","9","0","+","-","/","*","="};

        recyclerView.setLayoutManager(layoutManager);
        adapter = new MyRecyclerViewAdapter(this,data);

        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int Position) {
        TextView textView = findViewById(R.id.textView1);
        Calc = adapter.getdata(Position);
        calculatorLogic.Compute(Calc);
        //textView.setText(textView.getText()+Calc);

    }
}
