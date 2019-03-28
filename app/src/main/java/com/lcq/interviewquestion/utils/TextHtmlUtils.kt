package com.lcq.interviewquestion.utils

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.provider.Browser
import android.text.Html
import android.text.SpannableStringBuilder
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.text.style.URLSpan
import android.util.Log
import android.view.View

/**
 * TextView 超文本链接显示
 */
object TextHtmlUtils {
    /**
     * 格式化超链接文本内容并设置点击处理
     */
      fun getClickableHtml(html: String): CharSequence {
        val spannedHtml = Html.fromHtml(html)
        val clickableHtmlBuilder = SpannableStringBuilder(spannedHtml)
        val urls = clickableHtmlBuilder.getSpans(0, spannedHtml.length, URLSpan::class.java)
        for (span in urls) {
            setLinkClickable(clickableHtmlBuilder, span)
        }
        return clickableHtmlBuilder
    }

    /**
     * 设置点击超链接对应的处理内容
     */
    private fun setLinkClickable(clickableHtmlBuilder: SpannableStringBuilder, urlSpan: URLSpan) {
        val start = clickableHtmlBuilder.getSpanStart(urlSpan)
        val end = clickableHtmlBuilder.getSpanEnd(urlSpan)
        val flags = clickableHtmlBuilder.getSpanFlags(urlSpan)

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val uri = Uri.parse(urlSpan.url)
                val context = widget.context
                val intent = Intent(Intent.ACTION_VIEW, uri)
                intent.putExtra(Browser.EXTRA_APPLICATION_ID, context.packageName)
                try {
                    context.startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    e.printStackTrace()
                    Log.e("URLSpan", "Actvity was not found for intent, " + intent.toString())
                }

            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.color = Color.argb(255, 220, 20, 60);
                ds.isUnderlineText = false
            }
        }

        clickableHtmlBuilder.setSpan(clickableSpan, start, end, flags)
    }
}