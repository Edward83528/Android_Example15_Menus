package com.example.u0151051.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

//利用覆寫onCreateOptionsMenu, onOptionsItemSelected這二個方法來建立Menus選單
public class MainActivity extends AppCompatActivity {
    protected static final int MENU_ITEM1 = Menu.FIRST;
    protected static final int MENU_ITEM2 = Menu.FIRST + 1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //參數1:群組id, 參數2:識別符號, 參數3:選單順序, 參數4:item名稱
        menu.add(0, MENU_ITEM1, 0, "說明");
        menu.add(0, MENU_ITEM2, 1, "離開");
        return super.onCreateOptionsMenu(menu);
    }

    //onOptionsItemSelected這個函式是處理所有選項的主體
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //依據getitemId來判斷使用者點選哪一個item
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(MainActivity.this, "說明", Toast.LENGTH_SHORT).show();
                tv.setText("說明:");
                break;
            case 1:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
