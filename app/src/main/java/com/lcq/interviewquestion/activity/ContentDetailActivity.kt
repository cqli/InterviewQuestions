package com.lcq.interviewquestion.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import com.lcq.interviewquestion.R
import com.lcq.interviewquestion.result.ListResult
import com.lcq.interviewquestion.utils.TextHtmlUtils
import kotlinx.android.synthetic.main.activity_content_detail.*


class ContentDetailActivity : AppCompatActivity() {
    var result: ListResult? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail)
        result = intent.getSerializableExtra("result") as ListResult?
        result.let {

            tvTitle.text = TextHtmlUtils.getClickableHtml(result?.title!!);//解析html
            tvTitle.movementMethod = LinkMovementMethod.getInstance();//设置可点击

            tvContent.text = result?.content;//解析html
//            tvContent.movementMethod = LinkMovementMethod.getInstance();//设置可点击
        }
    }

}