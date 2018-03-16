package com.example.macosx.photographyassistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    ImageView img;
    TextView txtIsi,Judull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        img = findViewById(R.id.img);
        txtIsi = findViewById(R.id.isi);
        Judull = findViewById(R.id.judul);

        String Judul = getIntent().getStringExtra("NM_TEMPAT");
        String Isi = getIntent().getStringExtra("ISI_TEMPAT");
        int Gambar = getIntent().getIntExtra("GB_TEMPAT", 0);

        //set data ke widget
        img.setImageResource(Gambar);
        Judull.setText(Judul);
        txtIsi.setText(Isi);

    }
}
