package com.serra.disney;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF","onCreate has executed.....");
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF","onStart has executed....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF","onResume has executed....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF","onPause has executed....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF","onStop has executed....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF","onRestart has executed....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF","object is deallocated....");
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if (v.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.586931, 120.981243"));
            chooser = Intent.createChooser(i,"Select your preference");
            startActivity(chooser);
        }
    }
    public void display2(View v){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

}
