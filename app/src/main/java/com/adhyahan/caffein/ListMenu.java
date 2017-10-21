package com.adhyahan.caffein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {

    private static final String TAG = "ListMenu";
    private List<Row> trows = new ArrayList<>();
    private ListView listView;
    public String[][] array = new String[][]{
            {"1","Minuman","Kopi Hitam", "Kopi Hitam dibuat dengan teknik ekspreso, dimana biji kopi yang digunakan yaitu berasal dari aceh gayo jenis arabika, disajikan dengan gula terpisah","10000"},
            {"2","Minuman","Cappucino", "Paduan Kopi dengan buih susu kental serta menggunakan sirup karamel, dimana biji kopi yang digunakan berasal dari gunung puntang jawa barat jenis robusta","20000"},
            {"3","Minuman","Sparkling Tea", "Minuman Teh yang menggunakan daun teh dari pegunungan daerah garut dengan tambahan sari melati asli dan gula merah alami","15000"},
            {"4","Makanan","Batagor", "Baso Tahu Goreng dengan sajian bumbu kacang dan kecap khas bandung","25000"},
            {"5","Makanan","Cireng", "Makanan Ringan berupa tepung kanji goreng isi bahan dasar fermentasi yang disebut oncom, disajikan dengan bumbu kacang pedas","10000"},
            {"6","Makanan","Nasi Goreng", "Nasi Goreng Ayam yang disajikan dengan telur mata sapi disertai satai ayam","50000"},
            {"7","Desert","Chees Cake", "Kue Tart 1 slice dengan bahan utama cream cheese dengan toping buah buahan asli seperti anggur jeruk kiwi","40000"},
            {"8","Desert","Black Salad", "Potongan Buah segar yang terdiri dari pepaya jambu, melon dan mangga disajikan dengan bumbu rujak kacang pedas dan gula merah","30000"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        listView = (ListView) findViewById(R.id.listView);
        final Integer leng = array.length;
        Integer i = 0;
        while(i<leng){
            String nomor = array[i][0];
            String jenis = array[i][1];
            String nama = array[i][2];
            String penjelasan = array[i][3];
            String harga = array[i][4];
            Log.i(TAG,"leng"+leng+" No="+array[i][1]+" Jenis="+jenis+" Nama="+nama+" Penjelasan="+penjelasan+" Harga="+harga);
            final Row row = new Row();
            row.setNomer(nomor);
            row.setJenis(jenis);
            row.setNama(nama);
            row.setPenjelasan(penjelasan);
            row.setHarga("Rp "+harga);
            trows.add(row);
            i++;
        }
        displayResultList();
    }
    private void displayResultList(){
        final RowAdapter adaptor = new RowAdapter(this,trows);
        listView.setAdapter(adaptor);
    }
}
