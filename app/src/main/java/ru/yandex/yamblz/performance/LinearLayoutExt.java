package ru.yandex.yamblz.performance;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Debug;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Andrey on 20.07.2016.
 */
public class LinearLayoutExt extends LinearLayout {
    public LinearLayoutExt(Context context) {
        super(context);
    }

    public LinearLayoutExt(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutExt(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LinearLayoutExt(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        Debug.startMethodTracing(this.getTag() + "_onLayout_" + hashCode());
        super.onLayout(changed, l, t, r, b);
        Debug.stopMethodTracing();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Debug.startMethodTracing(this.getTag() + "_onMeasure_" + hashCode());
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Debug.stopMethodTracing();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Debug.startMethodTracing(this.getTag() + "_onDraw_" + hashCode());
        super.onDraw(canvas);
        Debug.stopMethodTracing();
    }
}
