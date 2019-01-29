package com.android.onur.eglencelibilgiler;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Ozden on 30/11/16.
 */
public class RenkPaleti {

    private String[] renkler = {
            "#39add1", // açık mavi
            "#3079ab", // koyu mavi
            "#c25975", // leylak
            "#e15258", // kırmızı
            "#f9845b", // turuncu
            "#838cc7", // lavanta
            "#7d669e", // mor
            "#53bbb4", // mavi
            "#51b46d", // yeşil
            "#e0ab18", // hardal
            "#637a91", // koyu gri
            "#f092b0", // pembe
            "#b7c0c7"  // açık gri
    };

    public int getRenk(){
        Random sayiUretici = new Random();
        int renkIndex = sayiUretici.nextInt(renkler.length);

        String renk = renkler[renkIndex];
        return Color.parseColor(renk);
    }

}
