package com.erenaksu.yazilimforum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    ImageView imageView;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button=findViewById(R.id.button2);
        button=findViewById(R.id.button3);
        button=findViewById(R.id.button4);
        imageView=findViewById(R.id.imageView2);
    }
    public void click(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void click2(View view){
        Intent intent=new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
    public void click3(View view){
        Intent intent=new Intent(MainActivity.this, MainActivity4.class);
        startActivity(intent);
    }
    public  void click4(View view){
        Intent intent=new Intent(MainActivity.this, MainActivity5.class);
        startActivity(intent);
    }
    public void github(View view){
        Uri uri=Uri.parse("https://github.com/er3nnz");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}