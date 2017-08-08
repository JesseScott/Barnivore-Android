package com.barnivore.barnivore.activities

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.barnivore.barnivore.R

/**
 *
 * Created by jessescott on 2017-08-08.
 *
 */


class MainActivity : Activity() {


    private val TAG = MainActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, TAG)

    }


}