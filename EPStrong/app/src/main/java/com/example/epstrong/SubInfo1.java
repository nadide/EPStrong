package com.example.epstrong;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubInfo1 extends AppCompatActivity {

    private TextView returntext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_info1);

        returntext = (TextView) findViewById(R.id.returntext);
        returntext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo1();
            }
        });
    }

    public void openSubinfo1(){
        Intent open = new Intent( this, InformationPage.class);
        startActivity(open);
    }
}
