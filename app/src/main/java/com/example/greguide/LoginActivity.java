package com.example.greguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
Button btn_submit;
EditText t1, t2, t3, t4, t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        t1=(EditText) findViewById(R.id.etFName);
        t2=(EditText) findViewById(R.id.etLName);
        t3=(EditText) findViewById(R.id.etDOB);
        t4=(EditText) findViewById(R.id.etPhoneNo);
        t5=(EditText) findViewById(R.id.etEmailId);

        btn_submit=(Button) findViewById(R.id.btnSubmit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(LoginActivity.this,DashboardActivity.class);
                startActivity(in2);
            }
        });
    }

    public void addRecord(View view) {
        Database db= new Database(this);
        db.addRecord(t1.getText().toString(), t2.getText().toString(), t3.getText().toString(), t4.getText().toString(), t5.getText().toString());

    }
}
