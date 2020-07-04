package com.example.greguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
Button bt_v;
 Button bt_q;
 Button bt_e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bt_v=(Button) findViewById(R.id.btv);
        bt_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(DashboardActivity.this,VerbalActivity.class);
                startActivity(in3);
            }
        });

        bt_q=(Button) findViewById(R.id.btq);
        bt_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(DashboardActivity.this,QuantActivity.class);
                startActivity(in4);
            }
        });

        bt_e=(Button) findViewById(R.id.bte);
        bt_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5=new Intent(DashboardActivity.this,ExtraActivity.class);
                startActivity(in5);
            }
        });
    }
}
