package com.example.flappy_bird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

class Background {
    int x=0,y=0;
    Bitmap background;

    Background(int screenX, int screenY, Resources res){
        background = BitmapFactory.decodeResource(res,R.drawable.background);
        background = Bitmap.createScaledBitmap(background,screenX,screenY,false);
    }
}
