package com.mahmoud.zaher.customtoastlibrary

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class CustomToast {
    companion object {
        @SuppressLint("InflateParams")
        fun showCustomToast(
            mContext: Context,
            toastIcon: Int,
            toastBackgroundColor: Int,
            toastTextColor: Int,
            toastMessage: String
        ) {

            val inflater: LayoutInflater = LayoutInflater.from(mContext)
            val view = inflater.inflate(R.layout.toast_layout, null, false)
            val toastText = view.findViewById<TextView>(R.id.toast_text)
            val toastImage = view.findViewById<ImageView>(R.id.toast_image)
            val toastLinearLayout = view.findViewById<LinearLayout>(R.id.toast_root)
            toastText.text = toastMessage
            toastText.setTextColor(
                ContextCompat.getColor(
                    mContext,
                    toastTextColor
                )
            )
            toastImage.setImageResource(toastIcon)
            toastLinearLayout.setBackgroundColor(
                ContextCompat.getColor(
                    mContext,
                    toastBackgroundColor
                )
            )
            val toast = Toast(mContext)
            toast.duration = Toast.LENGTH_LONG
            toast.view = view
            toast.show()
        }
    }
}