package com.example.moweb_practice07;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Rect extends Shape {
    public Rect(int startX, int startY, int stopX, int stopY, int color) {
        super(startX, startY, stopX, stopY, color);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(color);
        canvas.drawRect(startX, startY, stopX, stopY, paint);
    }
}
