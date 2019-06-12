package com.example.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editText);
        name=findViewById(R.id.editText2);
    }
    public void Bmi(View v){
        Intent intent=new Intent(this,Bmi.class);
        Bundle bundle=new Bundle();
        int bh=Integer.parseInt(height.getText().toString());
        String nam=name.getText().toString();
        bundle.putString("name",nam);
        bundle.putInt("bh",bh);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}

