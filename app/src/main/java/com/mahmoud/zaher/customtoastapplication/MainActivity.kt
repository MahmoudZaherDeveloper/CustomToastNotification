package com.mahmoud.zaher.customtoastapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mahmoud.zaher.customtoastlibrary.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomToast.showCustomToast(
            this,
            R.drawable.ic_toast_icon,
            R.color.colorPrimary,
            R.color.colorAccent,
            "This Is A Custom Toast!"
        )
    }
}
