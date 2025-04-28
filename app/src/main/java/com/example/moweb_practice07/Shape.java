package com.example.moweb_practice07;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    int startX, startY, stopX, stopY;
    int color;

    public Shape(int startX, int startY, int stopX, int stopY, int color) {
        this.startX = startX;
        this.startY = startY;
        this.stopX = stopX;
        this.stopY = stopY;
        this.color = color;
    }

    public abstract void draw(Canvas canvas, Paint paint);
}
