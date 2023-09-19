package com.cfd.belongmytoolbox.utils

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesUtils {

    /**
     * 儲存整數
     * */
    fun putInt(activity: Activity, key: String, value: Int) {
        val sharedPreferences: SharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        val edit : SharedPreferences.Editor = sharedPreferences.edit()
        edit.putInt(key, value)
        edit.apply()
    }

    fun getInt(activity: Activity, key: String): Int {
        val sharedPreferences: SharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        return sharedPreferences.getInt(key, 0)
    }

    /**
     * 儲存浮點數(Float)
     * */
    fun putFloat(activity: Activity, key: String, value: Float) {
        val sharedPreferences: SharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        val edit : SharedPreferences.Editor = sharedPreferences.edit()
        edit.putFloat(key, value)
        edit.apply()
    }

    fun getFloat(activity: Activity, key: String): Float {
        val sharedPreferences: SharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        return sharedPreferences.getFloat(key, 0f)
    }

    /**
     * 儲存字串
     * */
    fun putString(activity: Activity, key: String, value: String) {
        val sharedPreferences: SharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        val edit : SharedPreferences.Editor = sharedPreferences.edit()
        edit.putString(key, value)
        edit.apply()
    }

    fun getString(activity: Activity, key: String): String? {
        val sharedPreferences: SharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, null)
    }

}