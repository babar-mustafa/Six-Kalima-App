package com.example.babarmustafa.sixkalmaapp;

import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button for_exit;
    Button for_start;
    Button intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for_exit = (Button) findViewById(R.id.exit_button);
        for_start = (Button) findViewById(R.id.calling_button);
        intro = (Button) findViewById(R.id.me);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent y = new Intent(MainActivity.this,AboutMe.class);
                startActivity(y);
            }
        });


        for_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Kalma_MainActivity.class);
                startActivity(i);
            }
        });




        for_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Exit......?");
                builder.setMessage("Are You Share Want To Close App?");
                builder.setPositiveButton("No",null);
                builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                finish();
                System.exit(0);
                    }
                });

                builder.create().show();
            }
        });
    }
}
