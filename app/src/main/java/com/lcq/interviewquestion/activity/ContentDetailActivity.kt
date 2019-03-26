package com.lcq.interviewquestion.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lcq.interviewquestion.R
import com.lcq.interviewquestion.result.ListResult
import kotlinx.android.synthetic.main.activity_content_detail.*

class ContentDetailActivity : AppCompatActivity() {
    var result: ListResult? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail)
        result = intent.getSerializableExtra("result") as ListResult?
        result.let {
            tvTitle.text = result?.title
            tvContent.text = result?.content
        }
        tvContent.setOnClickListener {
            finish()
        }
    }
}