package com.barnivore.barnivore.helpers

/**
 *
 * Created by jessescott on 2017-08-08.
 *
 */

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.text.TextUtils
import android.util.Log


class PreferenceHelper(context: Context) {

    private val TAG = PreferenceHelper::class.java.simpleName
    private var mContext: Context = context
    private var preferences: SharedPreferences

    init {
        preferences = PreferenceManager.getDefaultSharedPreferences(mContext)
    }

    // region - Boolean

    fun setPrefBooleanValueByKey(key: String, value: Boolean) {
        if (value !is Boolean) {
            return
        }
        Log.d(TAG, "Setting $key to $value")
        val editor = preferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getPrefBooleanValueByKey(key: String): Boolean {
        val value = preferences.getBoolean(key, false)
        Log.d(TAG, "Getting preference $key with value $value")
        return value
    }

    // endregion

    // region - String

    fun setPrefStringValueByKey(key: String, value: String) {
        if (value !is String) {
            return
        }
        if (TextUtils.isEmpty(key) || TextUtils.isEmpty(value)) {
            return
        }
        Log.d(TAG, "Setting $key to $value")
        val editor = preferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getPrefStringValueByKey(key: String): String {
        val value = preferences.getString(key, "")
        Log.d(TAG, "Getting preference $key with value $value")
        return value
    }

    // endregion


}