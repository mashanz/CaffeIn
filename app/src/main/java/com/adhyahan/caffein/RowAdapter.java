package com.adhyahan.caffein;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RnEST on 10/21/2017.
 */

public class RowAdapter extends ArrayAdapter<Row> {
    public RowAdapter(@NonNull Context context, @NonNull List<Row> objects){
        super(context, R.layout.usr_menu_list, R.id.textNo, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final View rowView = inflater.inflate(R.layout.usr_menu_list, parent, false);
        TextView nomer = rowView.findViewById(R.id.textNo);
        TextView jenis = rowView.findViewById(R.id.textJenis);
        TextView nama = rowView.findViewById(R.id.textNama);
        TextView penjelasan = rowView.findViewById(R.id.textPenjelasan);
        TextView harga = rowView.findViewById(R.id.textHarga);

        final Row row = getItem(position);
        nomer.setText(row.getNomer());
        jenis.setText(row.getJenis());
        nama.setText(row.getNama());
        penjelasan.setText(row.getPenjelasan());
        harga.setText(row.getHarga());
        return rowView;
    }
}