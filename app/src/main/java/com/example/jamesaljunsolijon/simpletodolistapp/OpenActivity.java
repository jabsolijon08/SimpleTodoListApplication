package com.example.jamesaljunsolijon.simpletodolistapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OpenActivity extends AppCompatActivity {

    private TextView mtvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        mtvTitle = (TextView)findViewById(R.id.tvTask);
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            String j = (String) bundle.get("EXTRA_RICE");
//            mtvTitle.setText(j);
//        }
//        Intent intent = getIntent();
//        String title = intent.getStringExtra("EXTRA_RICE");
        //mtvTitle.setText(title);

        setContentView(R.layout.activity_open);
    }
}
