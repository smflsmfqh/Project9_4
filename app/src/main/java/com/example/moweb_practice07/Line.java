package com.example.moweb_practice07;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Line extends Shape {
    public Line(int startX, int startY, int stopX, int stopY, int color) {
        super(startX, startY, stopX, stopY, color);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(color);
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }
}
