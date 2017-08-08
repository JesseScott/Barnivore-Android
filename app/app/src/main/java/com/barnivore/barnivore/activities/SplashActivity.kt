package com.barnivore.barnivore.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.barnivore.barnivore.R
import com.barnivore.barnivore.helpers.PreferenceHelper

class SplashActivity : Activity() {

    private val TAG = SplashActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.d(TAG, TAG)

        val context: Context = applicationContext
        val preferenceHelper = PreferenceHelper(context)
        val hasOnboarded = preferenceHelper.getPrefBooleanValueByKey(context.getString(R.string.user_has_seen_onboarding))

        val timer = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(2500)

                    val intent: Intent
                    if (hasOnboarded) {
                        intent = Intent(context, MainActivity::class.java)
                    } else {
                        intent = Intent(context, OnboardingActivity::class.java)
                    }
                    startActivity(intent)
                    finish()
                } catch (e: InterruptedException) {
                    Log.d(TAG, "Error: " + e.localizedMessage)
                }

            }
        }
        timer.start()

    }
}
