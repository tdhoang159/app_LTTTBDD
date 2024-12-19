package com.example.appbansach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tạo Handler để chuyển Activity sau 10 giây
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Chuyển sang Activity2
                Intent intent = new Intent(MainActivity.this,Login_Activity.class);
                startActivity(intent);
                finish(); // Kết thúc Activity1 nếu không muốn quay lại
            }
        }, 5000); // 1000 milliseconds = 1 seconds

    }
}