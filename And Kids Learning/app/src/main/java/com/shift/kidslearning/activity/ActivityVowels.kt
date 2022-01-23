package com.shift.kidslearning.activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.shift.kidslearning.R
import android.view.animation.Animation.AnimationListener

import com.shift.kidslearning.utils.PopupViewAnimation


class ActivityVowels : AppCompatActivity() {
    private lateinit var activity: Activity
    private lateinit var context: Context

    //
    private lateinit var incShorbornoSorea: View
    private lateinit var incShorbornoSoreaa: View

    //
    private lateinit var sysBtnShorbornoSorea: Button
    private lateinit var sysBtnShorbornoSoreaa: Button

    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vowels)
        //
        activity = this
        context = this
        //
        incShorbornoSorea = findViewById(R.id.incShorbornoSorea)
        incShorbornoSoreaa = findViewById(R.id.incShorbornoSoreaa)
        //
        sysBtnShorbornoSorea = incShorbornoSorea.findViewById(R.id.sysBtnShorbornoSorea)
        sysBtnShorbornoSoreaa = incShorbornoSoreaa.findViewById(R.id.sysBtnShorbornoSoreaa)
        //
        val popupViewAnimation = PopupViewAnimation()
        sysBtnShorbornoSorea.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                popupViewAnimation.run(incShorbornoSorea, 0.3f, 0.3f)
            }

        })
        sysBtnShorbornoSoreaa.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                popupViewAnimation.run(incShorbornoSoreaa, 0.3f, 0.3f)
            }

        })
    }

    private fun onAnimateView(view: View?) {
        scaleViewDown(view, 0.3f, 0.3f, 1)

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
        animation.setAnimationListener(object : AnimationListener {
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
        animation.setAnimationListener(object : AnimationListener {
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

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    private fun onAnimateViewOld01(view: View?) {
        //view?.animate()!!.scaleX(0.5f).scaleY(0.5f)
        /*val set = AnimationSet(true)

        val anim: Animation = ScaleAnimation(1f, 0f, 1f, 0f, 0.5f, 0.5f)
        val animT: Animation = TranslateAnimation(0f, 0.5f, 0f, 0.5f)

        set.addAnimation(anim)
        set.addAnimation(animT)
        set.duration = 130

        view!!.startAnimation(set)*/
        val anim: Animation = ScaleAnimation(
            1f, 0.5f,  // Start and end values for the X axis scaling
            1f, 0.5f,  // Start and end values for the Y axis scaling
            Animation.RELATIVE_TO_SELF, 0.5f,  // Pivot point of X scaling
            Animation.RELATIVE_TO_SELF, 0.5f
        ) // Pivot point of Y scaling

        anim.fillAfter = true // Needed to keep the result of the animation

        anim.duration = 1000
        view?.startAnimation(anim)
    }
}