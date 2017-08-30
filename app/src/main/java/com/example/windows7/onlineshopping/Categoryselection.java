package com.example.windows7.onlineshopping;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categoryselection extends AppCompatActivity {
Button btnsort;
    AlertDialog.Builder builder;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryselection);
//        View mActionBarView1 = getLayoutInflater().inflate(R.layout.actionbarcategory, null);
//        getSupportActionBar().setCustomView(mActionBarView1);
//        getSupportActionBar().setDisplayOptions(getSupportActionBar().DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setElevation(0);

        btnsort=(Button)findViewById(R.id.btnsort);
        btnsort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder = new AlertDialog.Builder(Categoryselection.this);
                View vw = getLayoutInflater().inflate(R.layout.popupmenusort, null);
                builder.setView(vw);
                alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }
}
