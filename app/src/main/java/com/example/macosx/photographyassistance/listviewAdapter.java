package com.example.macosx.photographyassistance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hoidar on 3/16/18.
 */

public class listviewAdapter extends BaseAdapter {
    Context context;
    String[] data_nama_tempat;
    Integer[] data_gambar_tempat;
    String [] data_isi_artikel;

    public listviewAdapter(Context context, String[] namaTempat,
                           Integer[] gambarTempat, String[] isiArtikel) {
        //oper data ke global variabel
        this.context = context;
        this.data_nama_tempat = namaTempat;
        this.data_gambar_tempat = gambarTempat;
        this.data_isi_artikel = isiArtikel;
    }

    @Override
    public int getCount() {
        return data_nama_tempat.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.list_view, null);
        //inisialisasi widget
        ImageView ivGambarTempat = view.findViewById(R.id.img);
        TextView tvNamaTempat = view.findViewById(R.id.judul);
        TextView  tvIsiArtikel = view.findViewById(R.id.isi);
        //set nilai ke widget
        tvNamaTempat.setText(data_nama_tempat[i]);
        ivGambarTempat.setImageResource(data_gambar_tempat[i]);
//        tvIsiArtikel.setText(data_isi_artikel[i]);

        return view;
    }
}
