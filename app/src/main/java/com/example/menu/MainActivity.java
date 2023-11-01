package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        switch (id){
            case R.id.call:
                headerView.setText("Звонок");
                return true;
            case R.id.camera:
                headerView.setText("Камера");
                return true;
            case R.id.video:
                headerView.setText("Видео");
                return true;
            case R.id.email:
                headerView.setText("Почта");
                return true;
            case R.id.add:
                headerView.setText("Добавить");
                return true;
            case R.id.copy:
                headerView.setText("Скопировать");
                return true;
            case R.id.paste:
                headerView.setText("Вставить");
                return true;
            case R.id.help:
                headerView.setText("Помощь");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}