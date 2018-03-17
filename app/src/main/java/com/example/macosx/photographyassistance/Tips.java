package com.example.macosx.photographyassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Tips extends AppCompatActivity {

    String [] namaTempat = {"Learn all the rules so you can break them later","Expose and focus first, then frame your shot","Focus on the eyes","Make lots of mistakes, then learn from them","Perfect the exposure trifecta","Always be ready","Use a wider aperture for portraits to make your subject pop","Prevent blurry pictures by\n" +
            "matching shutter speed\n" +
            "to the lens focal length","Straighten and crop when editing","Avoid camera shake"};
    Integer[] menugambar = {
            R.drawable.tips1,R.drawable.tips2,R.drawable.tips3,R.drawable.tips4,R.drawable.tips5,R.drawable.tips6,R.drawable.tips7,R.drawable.tips8,R.drawable.tips9,R.drawable.tips10
    };
    String[] isiArtikel = {"Photography rules are essential because they provide a foundation for more advanced photography tips and tricks later on. Learn the rules first, so you have more creative control when breaking them later.\n" +
            "\n" +
            "Learn as you go — don’t let it prevent you from picking up a camera.",
            "An improperly exposed or blurry picture is unusable, but one not precisely framed may still be saved. For this reason, you should always focus on and properly expose for the subject before adjusting the frame.\n" +
                    "\n" +
                    "This is something that happens more often when you have extreme lights and darks in the same scene.",
            "We are always drawn towards the eyes in a photograph, since eyes are a natural focal point that we connect with.\n" +
                    "\n" +
                    "When taking portrait photographs at any aperture, make sure you nail the focus on the eyes. As long as the eyes are in focus, both you and your subject are more likely to consider the picture to be properly shot.",
            "The more mistakes you make, the faster you’ll learn and improve your photography skills. All professional photographers once started without an understanding of anything on a camera.\n" +
                    "\n" +
                    "The real value is in turning mistakes into lessons that build your skills. So try a technique or style you haven’t done before and expect to make many mistakes along the way.",
            "Getting proper exposure in photography consists of balancing three things: shutter speed, aperture, and ISO settings. You can start off by shooting in automatic or priority mode, but to get full control and shoot with manual camera controls you’ll have to understand the relationship between these three things that each directly affect the exposure and quality of your image."
            ,"Be as prepared as a boy scout and always be ready to snap a shot. Most digital SLRs have nearly instantaneous startup times, and it takes almost no extra battery power to leave your camera on.\n" +
            "\n" +
            "Keep your camera on one of the semi-auto or full automatic modes for unexpected pictures before your subject flies, drives, or runs away. You can always switch back to your preferred mode when you have time to adjust for a stationary subject. Sometimes you only have a split second to capture a great shot.",
            "Aim for an aperture size around f/2.8 to f/5.6 to make the background behind your subject more blurred out. This will help remove distracting backgrounds and make your subject stand out. You can experiment with even wider apertures, but take care to keep your subject’s eyes in focus.",
            "For example, if you’re using a 50mm lens you should use shutter speeds of 1/50 sec or faster to be able to capture handheld images and keep them sharp. Longer lenses are heavier and more difficult to keep steady — making the shutter speed faster helps avoid camera shake.",
            "You should try to straighten shots by looking through your camera’s viewfinder before capturing an image, but it’s not always easy to get this perfect on the first try.\n" +
                    "\n" +
                    "The viewfinder or the preview on your LCD is quite small compared to full-screen editing so you may realize it needs adjusting once you see it on a bigger screen. Simply rotate your images in post production software and crop out the empty spaces",
            "Camera shake can render a photo unusable. Increasing your ISO and opening up your aperture allows for quicker shutter speeds, reducing the chance of blurry images. However, this is not always an option if you’re trying to maintain other specific qualities of your image.\n" +
                    "\n" +
                    "Start by doing what you can to reduce camera movement, which begins with learning how to properly hold a camera."};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

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
                Intent intent = new Intent(Tips.this, Detail.class);

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