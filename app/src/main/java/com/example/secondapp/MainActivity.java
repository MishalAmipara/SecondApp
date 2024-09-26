package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD

public class MainActivity extends AppCompatActivity {

=======
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1,txt2;
>>>>>>> 7d7b4b7 (first commit)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
>>>>>>> 7d7b4b7 (first commit)
    }
}