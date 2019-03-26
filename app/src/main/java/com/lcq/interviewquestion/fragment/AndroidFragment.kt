package com.lcq.interviewquestion.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.lcq.interviewquestion.R
import com.lcq.interviewquestion.adapter.GeneralAdapter
import com.lcq.interviewquestion.result.ListResult
import kotlinx.android.synthetic.main.fragment_java.*

class AndroidFragment : BaseFragment() {
    override fun creatView(): View? {
        return View.inflate(context, R.layout.fragment_android, null)

    }

    var titleList = arrayListOf<ListResult>()
    var adapter: GeneralAdapter? = null
    override fun initView() {
        //设置LayoutManager为LinearLayoutManager
        recyclerView.layoutManager = LinearLayoutManager(context)
        //设置Adapter
        adapter = GeneralAdapter(context!!, titleList)
        recyclerView.adapter = adapter
    }

    override fun initData() {

        val content = "基本数据类型的==比较的值相等. \n" +
                "类的==比较的内存的地址，即是否是同一个对象，在不覆盖equals的情况下，同比较内存地址，原实现也为 == ，如String等重写了equals方法.\n" +
                "hashCode也是Object类的一个方法。返回一个离散的int型整数。在集合类操作中使用，为了提高查询速度。（HashMap，HashSet等比较是否为同一个）\n" +
                "如果两个对象equals，Java运行时环境会认为他们的hashcode一定相等。\n" +
                "如果两个对象不equals，他们的hashcode有可能相等。\n" +
                "如果两个对象hashcode相等，他们不一定equals。\n" +
                "如果两个对象hashcode不相等，他们一定不equals。"

        titleList.add(ListResult("java中==和equals和hashCode的区别 ", content))

        titleList.add(ListResult("int与integer的区别 ", content))

        titleList.add(ListResult("String、StringBuffer、StringBuilder区别", content))

        titleList.add(ListResult("什么是内部类？内部类的作用 ", content))

        titleList.add(ListResult("进程和线程的区别 ", content))

        titleList.add(ListResult("final，finally，finalize的区别", content))

        titleList.add(ListResult("Serializable 和Parcelable 的区别 ", content))

        titleList.add(ListResult("静态属性和静态方法是否可以被继承？是否可以被重写？以及原因", content))

        titleList.add(ListResult("成员内部类、静态内部类、局部内部类和匿名内部类的理解，以及项目中的应用", content))

        titleList.add(ListResult("string 转换成 integer的方式及原理", content))

        titleList.add(ListResult("哪些情况下的对象会被垃圾回收机制处理掉", content))

        titleList.add(ListResult("静态代理和动态代理的区别，什么场景使用", content))

        titleList.add(ListResult("Java中实现多态的机制是什么", content))

        titleList.add(ListResult("说说你对Java反射的理解 ", content))

        titleList.add(ListResult("说说你对Java注解的理解 ", content))

        titleList.add(ListResult("Java中String的了解 ", content))

        titleList.add(ListResult("String为什么要设计成不可变的", content))

        titleList.add(ListResult("Object类的equal和hashCode方法重写，为什么", content))

        titleList.add(ListResult("List,Set,Map的区别 ", content))

        titleList.add(ListResult("ArrayMap和HashMap的对比", content))

        titleList.add(ListResult("HashMap和HashTable的区别", content))

        titleList.add(ListResult("HashMap与HashSet的区别", content))

        titleList.add(ListResult("HashSet与HashMap怎么判断集合元素重复", content))

        titleList.add(ListResult("ArrayList和LinkedList的区别，以及应用场景", content))

        titleList.add(ListResult("数组和链表的区别", content))

        titleList.add(ListResult("开启线程的三种方式", content))

        titleList.add(ListResult("线程和进程的区别", content))

        titleList.add(ListResult("run()和start()方法区别", content))

        titleList.add(ListResult("如何控制某个方法允许并发访问线程的个数", content))

        titleList.add(ListResult("在Java中wait和seelp方法的不同", content))

        titleList.add(ListResult("谈谈wait/notify关键字的理解 ", content))

        titleList.add(ListResult("什么导致线程阻塞？线程如何关闭", content))

        titleList.add(ListResult("如何保证线程安全", content))

        titleList.add(ListResult("如何实现线程同步", content))

        titleList.add(ListResult("线程间操作List ", content))

        titleList.add(ListResult("谈谈对Synchronized关键字，类锁，方法锁，重入锁的理解", content))

        titleList.add(ListResult("synchronized 和volatile 关键字的区别 ", content))

        titleList.add(ListResult("ReentrantLock 、synchronized和volatile比较", content))

        titleList.add(ListResult("死锁的四个必要条件？ ", content))

        titleList.add(ListResult("什么是线程池，如何使用?", content))

        titleList.add(ListResult("Java中堆和栈有什么不同？", content))

        titleList.add(ListResult("有三个线程T1，T2，T3，怎么确保它们按顺序执行？", content))

        titleList.add(ListResult("AsyncTask的工作原理", content))

        titleList.add(ListResult("Binder的工作机制", content))

        titleList.add(ListResult("view的事件分发和view的工作原理", content))

        titleList.add(ListResult("Android中性能优化", content))

        titleList.add(ListResult("Android中性能优化", content))

        titleList.add(ListResult("Activity生命周期", content))

        titleList.add(ListResult("Service生命周期", content))

        titleList.add(ListResult("Activity的启动过程（不要回答生命周期", content))

        titleList.add(ListResult("Broadcast注册方式与区别", content))

        titleList.add(ListResult("HttpClient与HttpUrlConnection的区别 ", content))

        titleList.add(ListResult("java虚拟机和Dalvik虚拟机的区别", content))

        titleList.add(ListResult("进程保活（不死进程）", content))

        titleList.add(ListResult("讲解一下Context", content))

        titleList.add(ListResult("理解Activity，View,Window三者关系", content))

        titleList.add(ListResult("四种LaunchMode及其使用场景", content))

        titleList.add(ListResult("View的绘制流程", content))

        titleList.add(ListResult("View，ViewGroup事件分发", content))

        titleList.add(ListResult("保存Activity状态", content))

        titleList.add(ListResult("Android中的几种动画", content))

        titleList.add(ListResult("Android中跨进程通讯的几种方式", content))

        titleList.add(ListResult("AIDL理解", content))

        titleList.add(ListResult("Binde机制简单理解:", content))

        titleList.add(ListResult("Handler的原理", content))

        titleList.add(ListResult("Binder机制原理", content))

        titleList.add(ListResult("热修复的原理", content))

        titleList.add(ListResult("Android内存泄露及管理", content))

        titleList.add(ListResult("Fragment与Fragment、Activity通信的方式", content))

        titleList.add(ListResult("Android UI适配", content))

        titleList.add(ListResult("app优化", content))

        titleList.add(ListResult("图片优化", content))

        titleList.add(ListResult("HybridApp WebView和JS交互", content))

        titleList.add(ListResult("JAVA GC原理", content))

        titleList.add(ListResult("ANR", content))

        titleList.add(ListResult("RxJava", content))

        titleList.add(ListResult("RxJava", content))

        titleList.add(ListResult("手写算法（选择冒泡必须要会）", content))

        titleList.add(ListResult("JNI", content))

        titleList.add(ListResult("JNI", content))

        titleList.add(ListResult("Universal-ImageLoader，Picasso，Fresco，Glide对比", content))

        titleList.add(ListResult("Xutils, OKhttp, Volley, Retrofit对比", content))

        titleList.add(ListResult("线程中sleep和wait的区别", content))

        titleList.add(ListResult("Thread中的start()和run()方法有什么区别", content))

        titleList.add(ListResult("关键字final和static是怎么使用的", content))

        titleList.add(ListResult("String,StringBuffer,StringBuilder区别", content))

        titleList.add(ListResult("Java中重载和重写的区别", content))

        titleList.add(ListResult("Http https区别", content))

        titleList.add(ListResult("Http位于TCP/IP模型中的第几层？为什么说Http是可靠的数据传输协议", content))

        titleList.add(ListResult("HTTP链接的特点", content))

        titleList.add(ListResult("TCP和UDP的区别", content))

        titleList.add(ListResult("Socket建立网络连接的步骤", content))

        titleList.add(ListResult("11、Tcp／IP三次握手，四次挥手", content))

        titleList.add(ListResult("Android关于打包混淆需要知道的知识点", content))
//        adapter?.updata(titleList)
    }


}