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

        titleList.add(ListResult("int与integer的区别 ", "int 基本类型 \n" +
                "integer 对象 int的封装类"))

        titleList.add(ListResult("String、StringBuffer、StringBuilder区别", "String:字符串常量 不适用于经常要改变值得情况，每次改变相当于生成一个新的对象\n" +
                "StringBuffer:字符串变量 （线程安全）\n" +
                "StringBuilder:字符串变量（线程不安全） 确保单线程下可用，效率略高于StringBuffer"))

        titleList.add(ListResult("什么是内部类？内部类的作用 ", "内部类可直接访问外部类的属性\n" +
                "Java中内部类主要分为成员内部类、局部内部类(嵌套在方法和作用域内)、匿名内部类（没构造方法）、静态内部类（static修饰的类，不能使用任何外围类的非static成员变量和方法， 不依赖外围类）"))

        titleList.add(ListResult("进程和线程的区别 ", "进程是cpu资源分配的最小单位，线程是cpu调度的最小单位。\n" +
                "进程之间不能共享资源，而线程共享所在进程的地址空间和其它资源。\n" +
                "一个进程内可拥有多个线程，进程可开启进程，也可开启线程。\n" +
                "一个线程只能属于一个进程，线程可直接使用同进程的资源,线程依赖于进程而存在。"))

        titleList.add(ListResult("final，finally，finalize的区别", "final:修饰类、成员变量和成员方法，类不可被继承，成员变量不可变，成员方法不可重写\n" +
                "finally:与try...catch...共同使用，确保无论是否出现异常都能被调用到\n" +
                "finalize:类的方法,垃圾回收之前会调用此方法,子类可以重写finalize()方法实现对资源的回收"))

        titleList.add(ListResult("Serializable 和Parcelable 的区别 ", "Serializable Java 序列化接口 在硬盘上读写 读写过程中有大量临时变量的生成，内部执行大量的i/o操作，效率很低。\n" +
                "Parcelable Android 序列化接口 效率高 使用麻烦 在内存中读写（AS有相关插件 一键生成所需方法） ，对象不能保存到磁盘中"))

        titleList.add(ListResult("静态属性和静态方法是否可以被继承？是否可以被重写？以及原因", "Serializable Java 序列化接口 在硬盘上读写 读写过程中有大量临时变量的生成，内部执行大量的i/o操作，效率很低。\n" +
                "Parcelable Android 序列化接口 效率高 使用麻烦 在内存中读写（AS有相关插件 一键生成所需方法） ，对象不能保存到磁盘中"))

        titleList.add(ListResult("成员内部类、静态内部类、局部内部类和匿名内部类的理解，以及项目中的应用", "ava中内部类主要分为成员内部类、局部内部类(嵌套在方法和作用域内)、匿名内部类（没构造方法）、静态内部类（static修饰的类，不能使用任何外围类的非static成员变量和方法， 不依赖外围类）\n" +
                "使用内部类最吸引人的原因是：每个内部类都能独立地继承一个（接口的）实现，所以无论外围类是否已经继承了某个（接口的）实现，对于内部类都没有影响。\n" +
                "因为Java不支持多继承，支持实现多个接口。但有时候会存在一些使用接口很难解决的问题，这个时候我们可以利用内部类提供的、可以继承多个具体的或者抽象的类的能力来解决这些程序设计问题。可以这样说，接口只是解决了部分问题，而内部类使得多重继承的解决方案变得更加完整。"))

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
        val content_hunxiao = "这里说的的混淆其实是包括了代码压缩、" +
                "代码混淆以及资源压缩等的优化过程。依靠 ProGuard，混淆流程将主" +
                "项目以及依赖库中未被使用的类、类成员、方法、属性移除，这有助于规避64K方法数的瓶颈；" +
                "同时，将类、类成员、方法重命名为无意义的简短名称，增加了逆向工程的难度。" +
                "而依靠 Gradle 的 Android 插件，我们将移除未被使用的资源，可以有效减小 apk 安装包大小"



        titleList.add(ListResult("<a href=\"https://www.jianshu.com/p/158aa484da13\">Android关于打包混淆需要知道的知识点</a>", content_hunxiao))
//        adapter?.updata(titleList)
    }


}