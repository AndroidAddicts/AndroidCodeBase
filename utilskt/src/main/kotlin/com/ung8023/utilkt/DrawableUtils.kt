package com.ung8023.utilkt

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.GradientDrawable
import android.support.annotation.DrawableRes

object DrawableUtils {
    fun getShape(context: Context, @DrawableRes drawableRes: Int): GradientDrawable? {
        return context.resources.getDrawable(drawableRes) as GradientDrawable?
    }

    fun getShape(context: Context, @DrawableRes drawableRes: Int, theme: Resources.Theme): GradientDrawable? {
        return context.resources.getDrawable(drawableRes, theme) as? GradientDrawable
    }
}