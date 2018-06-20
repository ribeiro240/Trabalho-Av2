package com.example.android.trabalhoav2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sobreActivity(View view){

        Intent i = new Intent(this, SobreActivity.class);
        startActivity(i);

    }

    public void quebraCabecaActivity(View view){

        Intent i = new Intent(this, QuebraCabecaActivity.class);
        startActivity(i);

    }

    public void sliderActivity(View view){

        Intent i = new Intent(this, SliderActivity.class);
        startActivity(i);

    }
}
