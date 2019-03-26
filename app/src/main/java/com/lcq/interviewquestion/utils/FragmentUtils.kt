package com.lcq.interviewquestion.utils

import android.support.v4.app.Fragment
import com.lcq.interviewquestion.R
import com.lcq.interviewquestion.fragment.AndroidFragment
import com.lcq.interviewquestion.fragment.JavaFragment

/**
 * Created by lcq on 2017/12/5.
 * fragmeng 创建工具类
 */
class FragmentUtils private constructor() {
    val javaFragmet by lazy { JavaFragment() }
    val androidFragment by lazy { AndroidFragment() }

    //私有化构造方法
    companion object {
        val fragmentUtils by lazy { FragmentUtils() }
    }

    /**
     * 根据资源id创建并返回对应的fragmeng
     */
    fun getFragment(id: Int): Fragment? {
        when (id) {
            R.id.navigationJava -> return javaFragmet
            R.id.navigationAndroid-> return androidFragment
        }
        return null
    }
}