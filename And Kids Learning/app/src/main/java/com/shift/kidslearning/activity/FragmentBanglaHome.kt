package com.shift.kidslearning.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.shift.kidslearning.R

class FragmentBanglaHome : Fragment() {
    private lateinit var activity: Activity

    //private lateinit var context: Context
    private lateinit var sysBtnVowels: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity = requireActivity()
        //context = requireContext()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_bangla_home, container, false)
        sysBtnVowels = rootView.findViewById(R.id.sysBtnVowels)
        sysBtnVowels.setOnClickListener(context?.let { OnBtnClickListener(it) })
        return rootView
    }

    class OnBtnClickListener(context: Context) : View.OnClickListener {
        private var context: Context = context

        override fun onClick(view: View?) {
            val intent: Intent
            if (view!!.id == R.id.sysBtnVowels) {
                intent = Intent(context, ActivityVowels::class.java)
                context.startActivity(intent)
            } else if (view!!.id == R.id.sysBtnConsonants) {
                intent = Intent(context, ActivityConsonant::class.java)
                context.startActivity(intent)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}