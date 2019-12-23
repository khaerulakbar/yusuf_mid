package com.example.yusuf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman_02 extends AppCompatActivity {

    private Button fnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_02);

        fnext = (Button) findViewById(R.id.next);

        fnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rnext =new Intent(getApplicationContext(), halaman_03.class);
                startActivity(rnext);
                finish();
            }
        });
    }
}
