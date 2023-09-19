package com.example.assignmentno2part2;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn1=findViewById(R.id.button);
        Button btn2=findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "Sign Up Form Open", Toast.LENGTH_SHORT).show();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "Sign In Form Open", Toast.LENGTH_SHORT).show();
            }
        });
    }
}