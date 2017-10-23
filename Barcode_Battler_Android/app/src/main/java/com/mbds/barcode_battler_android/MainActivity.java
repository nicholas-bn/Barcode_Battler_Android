package com.mbds.barcode_battler_android;

import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mbds.barcode_battler_android.Controleur.GestionCombat;
import com.mbds.barcode_battler_android.Modele.Creature;
import com.mbds.barcode_battler_android.Service.Generation;
import com.mbds.barcode_battler_android.Service.HashService;

import static android.support.design.widget.Snackbar.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    Button btnScan;

    Generation generation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        generation = new Generation(getApplicationContext());

        btnScan = (Button) findViewById(R.id.btnScan);
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScannerActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String hash = data.getStringExtra("hash");

        Log.i("oui", hash);

        String result = generation.generate(hash);

        Snackbar mySnackbar = Snackbar.make(findViewById(android.R.id.content), result, LENGTH_LONG);
        mySnackbar.show();
=======
        Creature c1 = new Creature(10,5,5,"c1");
        Creature c2 = new Creature(10,5,5,"c2");
        new GestionCombat(c1, c2).commencerLaBagarre();
        //new Generation();

>>>>>>> e0200fb8d64088a5a3fac6ea0c3f1912c2c601e1
    }
}
