package com.cap.listview01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"阿尔巴尼亚","安道尔","奥地利","白俄罗斯","保加利亚",
            "法国","德国","阿尔巴尼亚","意大利","葡萄牙","罗马尼亚","俄罗斯","塞尔维亚","西班牙",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_expandable_list_item_1,data);

        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
