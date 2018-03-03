package com.gigoallen.a_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] financeGridIn = {"Allen", "Brown", "Cindy", "Dark", "Eason"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.grid);
        //第一種方法
        /*
        ArrayAdapter<CharSequence> adapterGrid =
                ArrayAdapter.createFromResource(this,
                        R.array.financeGrid,
                        android.R.layout.simple_list_item_1);
                        */
        //第二種方法
        ArrayAdapter adapterGrid =
                new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                        financeGridIn);

        gridView.setAdapter(adapterGrid);

        //實作傾聽者介面
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                Toast.makeText(this, financeGridIn[i], Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(this, financeGridIn[i], Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this, financeGridIn[i], Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(this, financeGridIn[i], Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(this, financeGridIn[i], Toast.LENGTH_LONG).show();
                break;
        }
    }
}
