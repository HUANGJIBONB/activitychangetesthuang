package com.example.administrator.activitychangetesthuangjibo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String AGT="MainActivity";
    Button buttonA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(AGT,"onCreate");
        buttonA = (Button) findViewById(R.id.buttonA);

        buttonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart() ;
        Log.i(AGT,"onStart") ;
    }

    @Override
    protected void onResume() {
        super.onResume() ;
        Log.i(AGT,"onResume") ;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(AGT,"onRestart") ;
    }

    @Override
    protected void onPause() {
        super.onPause() ;
        Log.i(AGT,"onPause") ;
    }

    @Override
    protected void onStop() {
        super.onStop() ;
        Log.i(AGT,"onStop") ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy() ;
        Log.i(AGT,"onDestroy") ;
    }
}

