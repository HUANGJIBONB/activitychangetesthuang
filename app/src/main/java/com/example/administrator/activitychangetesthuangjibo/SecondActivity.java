package com.example.administrator.activitychangetesthuangjibo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    protected static String AGT="SecondActivity";
    private Button buttonB;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(AGT,"onCreate");
        setContentView(R.layout.activity_second);
        buttonB = (Button) findViewById(R.id.buttonB);


        Log.i(AGT,"OnClickListener");
        buttonB.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
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
