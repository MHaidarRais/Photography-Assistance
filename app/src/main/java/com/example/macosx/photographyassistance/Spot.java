package com.example.macosx.photographyassistance;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Spot extends AppCompatActivity {

    String [] namaTempat = {"Gitgit Waterfalls,Bali","Bromo-Tengger-Semeru","Uluwatu Temple,Bali","Wooden Boats of Lake Tamblingan, Bali","Tanah lot bali Rocks"};
    Integer[] menugambar = {
            R.drawable.gitgit,R.drawable.bromo,R.drawable.uluwatu,R.drawable.tamblingan,R.drawable.tanahlot
    };
    String[] isiArtikel = {"Located 10km to the south of Singaraja, the cascading Gitgit Waterfalls are not far from the main road. The falls are just a few minutes away from the parking place. Many children will offer to guide you. But to find the waterfalls you will not need a guide, it´s very easy to find and you can´t miss. But the kids will be happy to earn some money by providing the service to you.",
                            "You should stay for a few nights in Cemoro Lawang. The village is located on the caldera rim and it is perfect for exploring the area on your own.",
                            "Uluwatu Temple is a famous sea temple in Bali. The temple is located at a steep cliff 70m over the Indian ocean.",
                            "From Pura Ulun Danu temple, walk 10 minutes to the right towards the boat house. Popular spot for prewedding photo shoots and also for camping. Boat hire is available but can be a little pricey by local standards.",
                            "it is a known spot but it must go down a esclalier to land on a fantastic beach . there is often a lot of wind and waves. you must come to the sunset"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot);

        // inisialisasi
        listView =  findViewById(R.id.mListview);
        //Buat Adapter

        //bawa data array
        listviewAdapter adapter1 = new listviewAdapter(this, namaTempat, menugambar, isiArtikel);
        // set widget ke adapter
        listView.setAdapter(adapter1);
        //Beri event onClick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Spot.this, Detail.class);

                //sisipkan data ke intent
                intent.putExtra("NM_TEMPAT", namaTempat[i]);
                intent.putExtra("GB_TEMPAT", menugambar[i]);
                intent.putExtra("ISI_TEMPAT",isiArtikel[i]);
                //mulai activity
                startActivity(intent);
            }
        });
    }
}
