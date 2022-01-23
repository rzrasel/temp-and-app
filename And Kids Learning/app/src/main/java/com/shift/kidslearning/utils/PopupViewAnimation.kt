package com.shift.kidslearning.utils

import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation

class PopupViewAnimation {
    public fun run(view: View, scaleX: Float, scaleY: Float) {
        scaleViewDown(view, 0.3f, 0.3f, 2)

    }

    private fun scaleViewDown(view: View?, scaleX: Float, scaleY: Float, repeat: Int) {
        val animation: Animation = ScaleAnimation(
            1f, scaleX,  // Start and end values for the X axis scaling
            1f, scaleY,  // Start and end values for the Y axis scaling
            Animation.RELATIVE_TO_SELF, 0.5f,  // Pivot point of X scaling
            Animation.RELATIVE_TO_SELF, 0.5f
        ) // Pivot point of Y scaling

        animation.fillAfter = true // Needed to keep the result of the animation

        animation.duration = 500
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                //
            }

            override fun onAnimationEnd(animation: Animation) {
                scaleViewUp(view, scaleX, scaleY)
            }

            override fun onAnimationRepeat(animation: Animation) {
                //
            }
        })
        view?.startAnimation(animation)
    }

    private fun scaleViewUp(view: View?, scaleX: Float, scaleY: Float) {
        val animation: Animation = ScaleAnimation(
            scaleX, 1f,  // Start and end values for the X axis scaling
            scaleY, 1f,  // Start and end values for the Y axis scaling
            Animation.RELATIVE_TO_SELF, 0.5f,  // Pivot point of X scaling
            Animation.RELATIVE_TO_SELF, 0.5f
        ) // Pivot point of Y scaling

        animation.fillAfter = true // Needed to keep the result of the animation

        animation.duration = 500
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                //
            }

            override fun onAnimationEnd(animation: Animation) {
                //
            }

            override fun onAnimationRepeat(animation: Animation) {
                //
            }
        })
        view?.startAnimation(animation)
    }
}