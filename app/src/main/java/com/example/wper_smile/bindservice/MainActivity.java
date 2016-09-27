package com.example.wper_smile.bindservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button staBtn=(Button)findViewById(R.id.staBtn);
        Button stopBtn=(Button)findViewById(R.id.stopBtn);
        staBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                intent.putExtra("num",10);
                startService(intent);
                //Toast.makeText(MainActivity.this, "Service启动成功", Toast.LENGTH_SHORT).show();
            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                stopService(intent);
                Toast.makeText(MainActivity.this, "Service关闭成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
