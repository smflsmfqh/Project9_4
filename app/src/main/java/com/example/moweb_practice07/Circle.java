package com.example.moweb_practice07;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends Shape {
    public Circle(int startX, int startY, int stopX, int stopY, int color) {
        super(startX, startY, stopX, stopY, color);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(color);
        int radius = (int) Math.sqrt(Math.pow(stopX - startX, 2) + Math.pow(stopY - startY, 2));
        canvas.drawCircle(startX, startY, radius, paint);
    }
}
