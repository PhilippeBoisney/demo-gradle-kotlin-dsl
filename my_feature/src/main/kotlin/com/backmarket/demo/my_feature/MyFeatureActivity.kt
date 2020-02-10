package com.backmarket.demo.my_feature

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyFeatureActivity : AppCompatActivity(R.layout.activity_my_feature) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log()
    }

    private fun log() {
        if (BuildConfig.ENABLE_LOGGING) {
            Log.d(MyFeatureActivity::class.java.simpleName, "onCreate() is called")
        }
    }
}
