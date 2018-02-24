package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DisplayUtil;

public class Practice8DrawArcView extends View {

    private int mWidth;
    private int mHeight;
    private Context mContext;

    public Practice8DrawArcView(Context context) {
        super(context);
        mContext = context;
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        RectF arcRect = new RectF(DisplayUtil.dip2px(mContext, 50), DisplayUtil.dip2px(mContext, 50),
                DisplayUtil.dip2px(mContext, 250), DisplayUtil.dip2px(mContext, 160));
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(arcRect,15,150,false,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(arcRect,180,60,false,paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(arcRect,250,100,true,paint);



    }
}
