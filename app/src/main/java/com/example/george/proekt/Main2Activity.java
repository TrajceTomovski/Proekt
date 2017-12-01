package com.example.george.proekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.textView2)
    TextView adduser;
    @BindView(R.id.name)
    EditText name;
    @BindView(R.id.lastname)
    EditText lastname;
    @BindView(R.id.username)
    EditText Username;
    @BindView(R.id.gender)
    RadioGroup gender;
    @BindView(R.id.radiomale)
    RadioButton radiomale;
    @BindView(R.id.radiofemale)
    RadioButton radiofemale;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        String Name = name.getText().toString();
        String Lastname = lastname.getText().toString();
        String username = Username.getText().toString();


    }

    @OnClick(R.id.next)
    public void klik2(View v) {

        Intent intent = new Intent();
        String senddata = Username.getText().toString();
        intent.putExtra("NAME EXTRA",senddata);
        setResult(RESULT_OK,intent);
        finish();


        int radiobuttonid = gender.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) gender.findViewById(radiobuttonid);
        Intent i = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(i);

        }




    }
