package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick_btn_ll(View v)
    {
        Intent i=new Intent(this,LinearLayoutActivity.class);
        this.startActivity(i);
    }
    public void onclick_btn_tl(View v)
    {
        Intent i=new Intent(this,CalActivity.class);
        this.startActivity(i);
    }
    public void onclick_btn_fl(View v)
    {
        Intent i=new Intent(this,FrameActivity.class);
        this.startActivity(i);
    }
    public void onclick_btn_rl(View v)
    {
        Intent i=new Intent(this,RelativeActivity.class);
        this.startActivity(i);
    }
    public void onclick_btn_tabl(View v)
    {
        Intent i=new Intent(this,TabActivity.class);
        this.startActivity(i);
    }
}