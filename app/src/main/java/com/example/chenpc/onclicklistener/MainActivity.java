package com.example.chenpc.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.button);
        btn1.setText("自身");
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"葵花第一宝典",Toast.LENGTH_LONG).show();
    }
}
