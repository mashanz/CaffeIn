package com.adhyahan.caffein;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cst extends AppCompatActivity {

    private static final String TAG = "Cst";
    private EditText tanggal, jam, meja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cst);
        tanggal = (EditText) findViewById(R.id.editTanggal);
        jam = (EditText) findViewById(R.id.editJam);
        meja = (EditText) findViewById(R.id.editMeja);
    }

    public void onPesan(View view){
        Log.i(TAG, "on Add Menu");

        Context context = getApplicationContext();
        CharSequence text = "Tanggal="+tanggal.getText().toString()+" Jam="+jam.getText().toString()+" meja="+meja.getText().toString();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Intent intent = new Intent(getApplicationContext(), CstMenuList.class);
        startActivities(new Intent[]{intent});
    }
}
