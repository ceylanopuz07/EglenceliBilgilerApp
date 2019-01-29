package com.android.onur.eglencelibilgiler;

import java.util.Random;

/**
 * Created by Ozden on 30/11/16.
 */
public class BilgiKitabi {

    private String[] bilgiler = {
            "Devekuşları atlardan daha hızlı koşmaktadırlar.",
            "Olimpiyat altın madalyalarının içeriğinin büyük bir kısmı gümüştür.",
            "Işığın güneşten dünyaya ulaşması 8 dakika sürmektedir.",
            "Bamboo bitkisi 1 günde yaklaşık 1 metre kadar büyüyebilir.",
            "Bazı penguenler suyun dışında 2-3 metre uzaklığa sıçrayabilirler.",
            "Bir insanın yeni bir alışkanlık edinmesi yaklaşık 66 gün sürer.",
            "Mavi rengi görebilen tek kuş baykuştur.",
            "Bir okyanusun en derin yerinde, demir bir topun dibe çökmesi bir saatten uzun sürer.",
            "Bir timsahın gözlerinin arasındaki mesafe, ayaklarının büyüklüğüne eşittir.",
            "Dünyadaki hayvanların yüzde sekseni altı ayaklıdır."
    };

    public String getBilgi(){
        Random sayiUretici = new Random();
        int bilgiIndex = sayiUretici.nextInt(bilgiler.length);

        String bilgi = bilgiler[bilgiIndex];
        return bilgi;
    }
}
