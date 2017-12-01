package com.example.george.proekt;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3Activity extends AppCompatActivity {

    User user2;
    User user1;
    int REQUEST_CODE = 1000;


    ArrayList<User> listusers = new ArrayList<>();

    BroadcastReceiver reciever;

    @BindView(R.id.textguest)
    TextView textquest;

    @BindView(R.id.editguest)
    EditText editguest;

    @BindView(R.id.edituser)
    Button edituser;

    @BindView(R.id.adduser)
    Button adduser;

    @BindView(R.id.imageman)
    ImageView imageman;

    @BindView(R.id.imagewomen)
    ImageView imagewomen;


    @BindView(R.id.changegender)
    TextView changegender;

    @BindView(R.id.checkinternet)
    Button checkinternet;

    @BindView(R.id.radiomale)
    RadioButton radiomale;
     @BindView(R.id.radiofemale)
     RadioButton radiofemale;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
        user1 = new User();
        user2 = new User();

        Intent intent = getIntent();
        if(intent.hasExtra("EXTRA")) {
            user2 = (User) intent.getSerializableExtra("EXTRA");
            listusers.add(user2);
        }

        Intent i = getIntent();
        if(i.hasExtra("NAME EXTRA")) {
            guest = (User) i.getSerializableExtra("NAME EXTRA");
            listusers.add(guest);
        }

        radiomale.setVisibility(View.VISIBLE);
        radiofemale.setVisibility(View.VISIBLE);
    }

    @OnClick (R.id.adduser)
    public  void klik(View v){
        Intent intent1 = new Intent(getApplicationContext(), Main2Activity.class);
        startActivityForResult(intent1,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000 && requestCode == RESULT_OK){
            String primi = data.getStringExtra("NAME EXTRA");
            editguest.setText(primi);
    }


    public void onRabioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        }
    }



}
