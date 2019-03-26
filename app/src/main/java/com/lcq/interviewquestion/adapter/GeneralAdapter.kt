package com.lcq.interviewquestion.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lcq.interviewquestion.R
import com.lcq.interviewquestion.activity.ContentDetailActivity
import com.lcq.interviewquestion.result.ListResult

class GeneralAdapter(//当前上下文对象
        internal var context: Context, //RecyclerView填充Item数据的List对象
        internal var datas: ArrayList<ListResult>) : RecyclerView.Adapter<GeneralAdapter.MyViewHolder>() {

    //创建ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //实例化得到Item布局文件的View对象
        val v = LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)
        //返回MyViewHolder的对象
        return MyViewHolder(v)
    }

    //绑定数据
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = datas[position].title
        holder.textView.setOnClickListener {
            val intent = Intent(context, ContentDetailActivity::class.java)
            intent.putExtra("result", datas[position])
            context.startActivity(intent)
        }
    }

    //返回Item的数量
    override fun getItemCount(): Int {
        return datas.size
    }

    //继承RecyclerView.ViewHolder抽象类的自定义ViewHolder
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.title)

    }

    fun updata(datas: ArrayList<ListResult>) {
        this.datas = datas;
        notifyDataSetChanged()
    }

    fun getDataList(): List<ListResult> {
        return datas
    }
}