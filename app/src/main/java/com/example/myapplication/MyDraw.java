package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


public class MyDraw extends View {

    int w = 10;

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        // Выбираем кисть
        paint.setStyle(Paint.Style.FILL);
        // Белый цвет кисти
        paint.setColor(Color.WHITE);
        // Закрашиваем холст
        canvas.drawPaint(paint);
        // Включаем сглаживание
        paint.setAntiAlias(true);
        paint.setColor(Color.argb(127, 0, 0, 255));
        Game g = MainActivity.g;
        w = Math.min(getWidth() , getHeight()) / g.width - 5;
        for (int i = 0; i < g.height; i++) {
            for (int j = 0; j < g.width; j++) {
                if (g.board[i][j] == 0) paint.setColor(Color.GRAY);
                if (g.board[i][j] == 1) paint.setColor(Color.GRAY);
                if (g.board[i][j] == 2) paint.setColor(Color.WHITE);
                if (g.board[i][j] == 3) paint.setColor(Color.WHITE);
                if (g.board[i][j] == 4) paint.setColor(Color.RED);
                if (g.board[i][j] == 5) paint.setColor(Color.RED);
                canvas.drawRect(w * j, w * i, w * (j + 1), w * (i + 1), paint);
            }
        }
        for (int i = 0; i < g.height; i++) {
            for (int j = 0; j < g.width; j++) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(Color.BLACK);
                paint.setStrokeWidth(8);
                canvas.drawRect(w * j, w * i, w * (j + 1), w * (i + 1), paint);
            }
        }



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int eventAction = event.getAction();
        if (eventAction == MotionEvent.ACTION_DOWN)  {
            // Движение вверх
            Integer x = (int)(event.getX() / w);
            Integer y = (int)(event.getY() / w);
            Log.d("coord", x.toString());
            MainActivity.g.board[y][x] = (MainActivity.g.board[y][x] +2)%6;

            this.invalidate();
        }
        return true;
    }
}
