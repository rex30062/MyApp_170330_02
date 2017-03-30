package com.cclz.myapp_170330_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String cites[]={"台北", "台中", "台南", "高雄"};
    String codes[]={"02", "04", "06", "07",};
    ArrayList<Map<String, String>> mylist = new ArrayList<>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);

        for(int i=0; i<cites.length; i++){
            Map m=new HashMap();
            m.put("city", cites[i]);
            m.put("code", codes[i]);
            mylist.add(m);
        }

        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this, mylist,
                R.layout.myitem, new String[]{"city", "code"},  // 自訂 layout
                new int[]{R.id.textView, R.id.textView2});  // tv1 大 tv2 小
        lv.setAdapter(adapter);
    }
}
