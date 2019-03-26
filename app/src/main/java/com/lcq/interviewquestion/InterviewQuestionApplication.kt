package com.lcq.interviewquestion

import android.app.Application
import android.content.Context
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.api.RefreshFooter
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.header.ClassicsHeader
import com.scwang.smartrefresh.layout.api.RefreshHeader
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator


class InterviewQuestionApplication : Application() {


    companion object {
        var mAppContext: Context? = null
        init {
            //设置全局的Header构建器
            SmartRefreshLayout.setDefaultRefreshHeaderCreator { context, layout ->
                layout.setPrimaryColorsId(R.color.white, android.R.color.background_dark);//全局设置主题颜色
                ClassicsHeader(context)
                //.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
            }
            //设置全局的Footer构建器
            SmartRefreshLayout.setDefaultRefreshFooterCreator { context, layout ->
                layout.setPrimaryColorsId(R.color.white, android.R.color.background_dark);//全局设置主题颜色
                ClassicsFooter(context)
            }
        }
    }



    /**
     * @return 获取全局Context对象
     */

    override fun onCreate() {
        super.onCreate()
        mAppContext = applicationContext
    }
}