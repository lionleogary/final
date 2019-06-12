package com.example.afinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Bmi extends AppCompatActivity{
    private EditText hei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);


    }
    private void show(){
        Bundle bundle=getIntent().getExtras();
        hei=findViewById(R.id.height);
        hei.setText(bundle.getInt("bh"));
    }
    public void finished(View v){
        super.finish();
    }
}