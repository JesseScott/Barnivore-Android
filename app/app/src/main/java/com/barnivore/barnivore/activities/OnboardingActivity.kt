package com.barnivore.barnivore.activities

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import com.barnivore.barnivore.R
import com.barnivore.barnivore.helpers.PreferenceHelper

/**
 *
 * Created by jessescott on 2017-08-08.
 *
 */


class OnboardingActivity : Activity() {


    private val TAG = OnboardingActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        Log.d(TAG, TAG)


        val context: Context = applicationContext
        val preferenceHelper = PreferenceHelper(context)
        preferenceHelper.setPrefBooleanValueByKey(context.getString(R.string.user_has_seen_onboarding), true)

    }


}