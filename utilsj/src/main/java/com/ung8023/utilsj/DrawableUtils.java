package com.ung8023.utilsj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

public class DrawableUtils {
    public static GradientDrawable getShape(@NonNull Context context, @DrawableRes int drawableRes) {
        return (GradientDrawable) context.getResources().getDrawable(drawableRes);
    }

    public static GradientDrawable getShape(@NonNull Context context, @DrawableRes int drawableRes, Resources.Theme theme) {
        return (GradientDrawable) context.getResources().getDrawable(drawableRes, theme);
    }
}
