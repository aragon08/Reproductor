package com.example.orion.reproductor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Inicio extends AppCompatActivity {

    @BindView(R.id.pgbAvance)
    ProgressBar pgbAvance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ButterKnife.bind(this);

        new Hilo(pgbAvance,this).execute();
    }
}
