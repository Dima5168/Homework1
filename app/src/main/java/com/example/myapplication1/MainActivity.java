package com.example.myapplication1;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String KEY_COUNT = "key";
    private  int count=0;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        //дополнение 2 занятия 3 модуля
        button.setOnClickListener(lisener);
    }

    //для 1 занятия 3 модуля

    /*
    public void onButtonClick(View view){
    // count++;
    //textView.setText(Integer.toString(count));
    }
    */


    //для 2 занятия 3 модуля
  private View.OnClickListener lisener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count++;
            textView.setText(Integer.toString(count));
        }
    };

//Продолжение работы
    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStart()",Toast.LENGTH_SHORT);
        toast.show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStop()",Toast.LENGTH_SHORT);
        toast.show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy()",Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),"onPause()",Toast.LENGTH_SHORT);
        toast.show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"onResume()",Toast.LENGTH_SHORT);
        toast.show();
        super.onResume();
        textView.setText(Integer.toString(count));
    }

    //выполняем ДЗ

    //сохраняем
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
    }

    //восстанавливаем
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt(KEY_COUNT);
    }
    //Домашняя работа №1 выполнена
}





