package com.example.shinyv.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.shinyv.customtoast.ToastFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"提示",Toast.LENGTH_SHORT).show();
        //ToastFactory.getInstance(MainActivity.this).makeTextShow(MainActivity.this,"你好",Toast.LENGTH_SHORT);
    }
}
