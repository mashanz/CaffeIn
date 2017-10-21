package com.adhyahan.caffein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class UsrOrCst extends AppCompatActivity {

    private static final String TAG = "USER OR CUSTOMER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usr_or_cst);
    }

    public void onCst(View view){
        Log.i(TAG, "I AM CUSTOMER");
        Intent intent = new Intent(getApplicationContext(), Cst.class);
        startActivities(new Intent[]{intent});
    }

    public void onUsr(View view){
        Log.i(TAG, "I AM USER");
        Intent intent = new Intent(getApplicationContext(), ListMenu.class);
        startActivities(new Intent[]{intent});
    }
}
