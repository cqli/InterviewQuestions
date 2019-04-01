package com.lcq.interviewquestion.weight

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.apkfuns.logutils.LogUtils

class CustomView : View {
    constructor(context: Context) : super(context) {}
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {}
    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(context, attributeSet, defStyleAttr) {}

    init {
        LogUtils.d("")
    }
}