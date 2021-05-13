package com.example.id;

import androidx.appcompat.app.AppCompatActivity;

import android.app.*;
import android.os.*;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        ed1=(EditText) findViewById(R.id.user);
        ed2=(EditText) findViewById(R.id.pass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("argie")&& ed2.getText().toString().equals("admin1")){
                    Toast.makeText(getApplicationContext(),"Access Granted",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    startActivity(intent);

                }else if(ed1.getText().toString().equals("jezreel")&& ed2.getText().toString().equals("admin2")) {
                    Toast.makeText(getApplicationContext(), "Access Granted", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(MainActivity.this,Dashboard1.class);
                    startActivity(intent1);
                }else if(ed1.getText().toString().equals("quaynie")&& ed2.getText().toString().equals("admin3")) {
                    Toast.makeText(getApplicationContext(), "Access Granted", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this,Dashboard2.class);
                    startActivity(intent2);
                }else if(ed1.getText().toString().equals("jake")&& ed2.getText().toString().equals("admin4")) {
                    Toast.makeText(getApplicationContext(), "Access Granted", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(MainActivity.this,Dashboard3.class);
                    startActivity(intent3);
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}