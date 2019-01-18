package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice05SetFakeBoldTextView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice05SetFakeBoldTextView(Context context) {
        super(context);
    }

    public Practice05SetFakeBoldTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05SetFakeBoldTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);

        // 使用 Paint.setFakeBoldText() 来加粗文字
        // 之所以叫伪粗体（ fake bold ），因为它并不是通过选用更高 weight 的字体让文字变粗，而是通过程序在运行时把文字给「描粗」了
        paint.setFakeBoldText(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText(text, 50, 100, paint);
    }
}
