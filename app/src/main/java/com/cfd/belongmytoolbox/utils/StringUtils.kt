package com.cfd.belongmytoolbox.utils

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.core.content.ContextCompat

class StringUtils {

    /**
     * 設定字串樣式
     * @param targetString 目標字串
     * @param type 字體樣式
     * @param start 索引起點
     * @param end 索引終點
     * */
    fun SpanStringStyle(
        targetString: String,
        type: Int,
        start: Int,
        end: Int
    ): SpannableString {

        val spannableString = SpannableString(targetString)
        spannableString.setSpan(StyleSpan(type), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        return spannableString
    }

    /**
     * 設定字串顏色
     * @param targetString 目標字串
     * @param start 索引起點
     * @param end 索引終點
     * */
    fun SpanStringColor(
        context: Context,
        targetString: String,
        color: Int,
        start: Int,
        end: Int
    ): SpannableString {

        val spannableString = SpannableString(targetString)
        spannableString.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(context, color)),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        return spannableString
    }

    /**
     * 設定字串樣式與顏色
     * @param targetString 目標字串
     * @param type 字體樣式
     * @param start 索引起點
     * @param end 索引終點
     * */
    fun SpanString(
        context: Context,
        targetString: String,
        type: Int,
        color: Int,
        start: Int,
        end: Int
    ): SpannableString {

        val spannableString = SpannableString(targetString)
        spannableString.setSpan(StyleSpan(type), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(context, color)),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        return spannableString
    }


}