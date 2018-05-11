package com.example.uset.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

        private static final String[] strs = new String[] {
        "王希畅  计科1504  2015011323", "刘强东 计科1504  2015888888", "马化腾 计科1504 2015666666", "李彦宏 计科1504 2015011323", "马云 计科1504 2015011323"
        };//定义一个String数组用来显示ListView的内容
private ListView lv;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);//得到ListView对象的引用
/*为ListView设置Adapter来绑定数据*/
        lv.setAdapter(new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, strs));

        }
        }