package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DisplayUtil;

public class Practice2DrawCircleView extends View {

    private int screen_w;
    private int screen_h;

    private int radius;

    public Practice2DrawCircleView(Context context) {
        super(context);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        screen_w = dm.widthPixels;
        screen_h = dm.heightPixels;
        radius = DisplayUtil.dip2px(getContext(), 55);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int left = DisplayUtil.dip2px(getContext(), 110);
        int top = DisplayUtil.dip2px(getContext(), 70);
        int right = DisplayUtil.dip2px(getContext(), 250);
        int bottom= DisplayUtil.dip2px(getContext(),195);
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(DisplayUtil.dip2px(getContext(), 1));
        canvas.drawCircle(left, top, radius, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(right, top, radius, paint);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(left,bottom,radius,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(right,bottom,radius,paint);
    }
}
