package com.gigoallen.a_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.grid);

        ArrayAdapter<CharSequence> adapterGrid = ArrayAdapter.createFromResource(this, R.array.financeGrid, android.R.layout.simple_list_item_1);

        gridView.setAdapter(adapterGrid);
    }
}
