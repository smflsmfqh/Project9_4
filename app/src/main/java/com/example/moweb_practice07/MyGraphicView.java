package com.example.moweb_practice07;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MyGraphicView extends View {
    int startX = -1, startY = -1, stopX = -1, stopY = -1;
    Paint paint;
    ArrayList<Shape> shapeList = new ArrayList<>();

    public MyGraphicView(Context context) {
        super(context);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(MainActivity.curColor);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = (int) event.getX();
                startY = (int) event.getY();
                break;
            case MotionEvent.ACTION_UP:
                stopX = (int) event.getX();
                stopY = (int) event.getY();

                Shape shape = null;
                switch (MainActivity.curShape) {
                    case MainActivity.LINE:
                        shape = new Line(startX, startY, stopX, stopY, MainActivity.curColor);
                        break;
                    case MainActivity.CIRCLE:
                        shape = new Circle(startX, startY, stopX, stopY, MainActivity.curColor);
                        break;
                    case MainActivity.RECTANGLE:
                        shape = new Rect(startX, startY, stopX, stopY, MainActivity.curColor);
                        break;
                }
                if (shape != null) {
                    shapeList.add(shape);
                }
                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (Shape shape : shapeList) {
            paint.setColor(shape.color);
            shape.draw(canvas, paint);
        }
    }
}
