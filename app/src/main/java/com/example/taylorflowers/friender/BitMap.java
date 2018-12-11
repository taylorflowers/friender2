package com.example.taylorflowers.friender;

import android.graphics.Bitmap;

public class BitMap {

    private static Bitmap bit = null;

    public BitMap(Bitmap b) {
        if (b != null) {
            bit = b;
        }
    }

    public static Bitmap getMap() {
        return bit;
    }
}
