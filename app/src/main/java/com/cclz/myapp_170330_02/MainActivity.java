package com.cclz.myapp_170330_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String cites[]={"台北", "台中", "台南", "高雄"};
    String codes[]={"02", "04", "06", "07",};
//    ArrayList<Map<String, String>> mylist = new ArrayList<>();
    int imgs[] = {R.drawable.taipei, R.drawable.taichung, R.drawable.tainan, R.drawable.kaohsiung};
    ArrayList<Map<String, Object>> mylist = new ArrayList<>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);

        for(int i=0; i<cites.length; i++){
//            Map m=new HashMap();
            Map<String, Object> m=new HashMap();
            m.put("city", cites[i]);
            m.put("code", codes[i]);
            m.put("img", imgs[i]);
            mylist.add(m);
        }

        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this, mylist,
//                android.R.layout.simple_expandable_list_item_2, new String[]{"city", "code"},
//                new int[]{android.R.id.text1, android.R.id.text2});
//                R.layout.myitem, new String[]{"city", "code"},  // 自訂 layout
//                new int[]{R.id.textView, R.id.textView2});  // tv1 大 tv2 小
                R.layout.myitem, new String[]{"city", "code", "img"},  // 自訂 layout + 圖
                new int[]{R.id.textView, R.id.textView2, R.id.imageView});  // tv1 大 tv2 小 + 圖
        lv.setAdapter(adapter);
    }
}
