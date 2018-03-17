package com.example.macosx.photographyassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Tools extends AppCompatActivity {

    String [] namaTempat = {"Camera","Lenses","Tripod","Software","Lighting","Filters"};
    Integer[] menugambar = {
            R.drawable.tools1,R.drawable.tools2,R.drawable.tools3,R.drawable.tools4,R.drawable.tools5,R.drawable.tools6
    };
    String[] isiArtikel = {"The core of photography is a camera, or at least the sensor of a camera. At the moment, one of the biggest debates in the photography world is between two different types of cameras: mirrorless and DSLR cameras. Both have their merits, but a beginning photographer on a tight budget should be looking more closely at DSLRs. With entry-level models, new mirrorless cameras cost about the same as new DSLRs, and sometimes less. However, you can still buy older, high-quality DSLR equipment (including lenses) for a lower price than similar mirrorless gear. Mirrorless cameras are filling this gap quickly, but the best camera for a beginner on a budget is almost certainly a DSLR.\n" +
            "\n",
            "Whereas a camera sensor will record the light that it receives, a lens’s job is arguably even more important: help the light get to the sensor in the first place.\n" +
                    "\n" +
                    "Lenses range from the “free” — those which come in a kit with the camera — to the unbelievably expensive. As a beginner, it can be tough to determine which lenses are worth their asking price, especially if you have no prior knowledge of which lenses even exist in the first place (although our lens database can help).\n" +
                    "\n",
            "Often overlooked and undervalued, a tripod doesn’t seem nearly as important as it really is. After all, three aluminum sticks glued together are no more complex than three sticks glued together. Right? Unfortunately, that logic is why many photographers choose to buy the least expensive tripod they can find, then leave it at home all the time because it’s cheaply-made and hard to use. A tripod should be as popular as its buddies Camera and Lens, but somewhere along the way it got the short end of the stick.\n" +
                    "\n",
            "There is a lot of competition for software that processes images, with the two most popular options being Capture One Pro and Adobe Lightroom. These two programs are similar — they both allow you to organize and edit your photos — but Lightroom is far less expensive. Some argue that Capture One Pro is better (whereas some argue the opposite), but Lightroom will is ideal for those on a budget, since it costs half the price. For what it’s worth, I only ever use Lightroom, and I find it to be wonderful.",
            "Nikon brand flashes cost hundreds of dollars, assuming that you want a flash that can function off-camera in an automatic (TTL) mode. However, third-party flashes with those features can be fairly cheap — check out the Yongnuo YN-568EX, an extremely well-specified flash for the price of $105. Depending upon the genre of photography you practice most, this may be the only flash you need. (Or you may need dozens more — ask any portrait photographer!) Here is a link to the Yongnuo flash at B&H."};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

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
                Intent intent = new Intent(Tools.this, Detail.class);

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