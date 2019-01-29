package com.android.onur.eglencelibilgiler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class EglenceliBilgilerActivity extends AppCompatActivity {

    private TextView bilgiTextView;
    private TextView baslikTextView;
    private Button yeniBilgiButton;
    private RelativeLayout eglenceliBilgilerLayout;

    private BilgiKitabi bilgiKitabi = new BilgiKitabi();
    private RenkPaleti renkPaleti = new RenkPaleti();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eglenceli_bilgiler);

        bilgiTextView = (TextView) findViewById(R.id.bilgiTextView);
        baslikTextView = (TextView) findViewById(R.id.baslikTextView);
        yeniBilgiButton = (Button) findViewById(R.id.yeniBilgiButton);
        eglenceliBilgilerLayout = (RelativeLayout) findViewById(R.id.eglenceliBilgilerLayout);

        yeniBilgiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bilgiTextView.setText(bilgiKitabi.getBilgi());

                int randomRenk = renkPaleti.getRenk();
                eglenceliBilgilerLayout.setBackgroundColor(randomRenk);
                yeniBilgiButton.setTextColor(randomRenk);

                Toast.makeText(EglenceliBilgilerActivity.this, "Butona Basıldı", Toast.LENGTH_SHORT).show();

                Log.e("MainActivity", "Hata Mesajı!");
                Log.d("MainActivity", "Debug Mesajı!");
                Log.i("MainActivity", "Bilgi Mesajı!");
                Log.wtf("MainActivity", "Aman Tanrım!");
            }
        });
    }
}
