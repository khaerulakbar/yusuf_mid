package com.example.yusuf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman_03 extends AppCompatActivity {

    private Button flogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_03);

        flogout =(Button) findViewById(R.id.logout);

        flogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rlogout =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(rlogout);
                finish();
            }
        });

    }
}
