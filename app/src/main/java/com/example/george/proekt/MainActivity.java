package com.example.george.proekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.logIn)
    Button logIn;

    @BindView(R.id.guest)
    TextView guest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.logIn)
    public void kopce(View v){
        Intent intent = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.guest)
    public void continueasguest(View v){
        Intent intent1 = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent1);
    }
}
