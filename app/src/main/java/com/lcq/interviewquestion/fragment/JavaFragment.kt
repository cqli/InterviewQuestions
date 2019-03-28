package com.lcq.interviewquestion.fragment

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.lcq.interviewquestion.R
import com.lcq.interviewquestion.adapter.GeneralAdapter
import com.lcq.interviewquestion.result.ListResult
import kotlinx.android.synthetic.main.fragment_java.*


class JavaFragment : BaseFragment() {
    override fun creatView(): View? {
        return View.inflate(context, R.layout.fragment_java, null)

    }

    var titleList = arrayListOf<ListResult>()
    var adapter: GeneralAdapter? = null
    override fun initView() {
        //设置LayoutManager为LinearLayoutManager
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        //设置Adapter
        adapter = GeneralAdapter(context!!, titleList)
        recyclerView.setAdapter(adapter)
    }

    override fun initData() {

        val content = "一，B/S结构（Browser/Server，浏览器/服务器模式），是WEB兴起后的一种网络结构模式，WEB浏览器是客户端最主要的应用软件。这种模式统一了客户端，将系统功能实现的核心部分集中到服务器上，简化了系统的开发、维护和使用。客户机上只要安装一个浏览器（Browser英 ['braʊzə]美 ['braʊzɚ]），如Netscape Navigator或Internet Explorer，服务器安装SQL Server、Oracle、MYSQL等数据库。浏览器通过Web Server 同数据库进行数据交互。\n" +
                "\n" +
                "二，区别(C/S与B/S)：\n" +
                "\n" +
                "1.硬件环境不同：\n" +
                "\n" +
                "C/S 一般建立在专用的网络上，小范围里的网络环境，局域网之间再通过专门服务器提供连接和数据交换服务。B/S 建立在广域网之上的，不必是专门的网络硬件环境，例如电话上网，租用设备. 信息自己管理. 有比C/S更强的适应范围，一般只要有操作系统和浏览器就行。\n" +
                "\n" +
                "2.对安全要求不同：\n" +
                "\n" +
                "C/S 一般面向相对固定的用户群，对信息安全的控制能力很强。 一般高度机密的信息系统采用C/S 结构适宜。可以通过B/S发布部分可公开信息。B/S 建立在广域网之上， 对安全的控制能力相对弱， 可能面向不可知的用户。\n" +
                "\n" +
                "3.对程序架构不同:\n" +
                "\n" +
                "C/S 程序可以更加注重流程， 可以对权限多层次校验， 对系统运行速度可以较少考虑。\n" +
                "\n" +
                "B/S 对安全以及访问速度的多重的考虑，建立在需要更加优化的基础之上. 比C/S有更高的要求 B/S结构的程序架构是发展的趋势，从MS的.Net系列的BizTalk 2000 Exchange 2000等，全面支持网络的构件搭建的系统。SUN 和IBM推JavaBean 构件技术等，使 B/S更加成熟.。\n" +
                "\n" +
                "4.开发维护成本\n" +
                "\n" +
                "cs开发维护成本高于bs。因为采用cs结构时，对于不同的客户端要开发不同的程序，而且软件安装调试和升级都需要在所有客户机上进行。\n" +
                "\n" +
                "bs，只需要将服务器上的软件版本升级，然后从新登录就可以了。\n" +
                "\n" +
                "5.客户端负载\n" +
                "\n" +
                "cs客户端负载大。cs客户端不仅负责和用户的交互，收集用户信息，而且还需要通过网络向服务器发出请求。\n" +
                "\n" +
                "bs把事务处理逻辑部分交给了服务器，客户端只是负责显示。\n" +
                "\n" +
                "6.处理问题不同\n" +
                "\n" +
                "C/S 程序可以处理用户面固定，并且在相同区域，安全要求高，需求与操作系统相关. 应该都是相同的系统。\n" +
                "\n" +
                "B/S 建立在广域网上， 面向不同的用户群，分散地域， 这是C/S无法作到的。与操作系统平台关系最小。\n" +
                "\n" +
                "7.用户接口不同 \n" +
                "\n" +
                "C/S 多是建立的Window平台上，表现方法有限，对程序员普遍要求较高。\n" +
                "\n" +
                "B/S 建立在浏览器上， 有更加丰富和生动的表现方式与用户交流. 并且大部分难度减低，减低开发成本。\n" +
                "\n" +
                "扩展资料：\n" +
                "\n" +
                "联系(C/S与B/S)\n" +
                "\n" +
                "1.C/S是Client/Server的缩写。服务器通常采用高性能的PC、工作站或小型机，并采用大型数据库系统，如Oracle、Sybase、Informix或 SQL Server。客户端需要安装专用的客户端软件。\n" +
                "\n" +
                "2.B/S是Browser/Server的缩写，客户机上只要安装一个浏览器（Browser），如Netscape Navigator或Internet Explorer，服务器安装Oracle、Sybase、Informix或 SQL Server等数据库。在这种结构下，用户界面完全通过WWW浏览器实现，一部分事务逻辑在前端实现，但是主要事务逻辑在服务器端实现。浏览器通过Web Server 同数据库进行数据交互。\n" +
                "\n" +
                "3.系统开发中C/S结构（Client/Server）中Client（客户端）往往可以由 B/S结构（Browser/Server结构）的Browser（浏览器）及其载体承担，C/S结构的Web应用与B/S结构（Browser/Server结构）具有紧密联系。大系统和复杂系统中，C/S结构和B/S结构的嵌套也很普遍。\n" +
                "\n" +
                "4.原来的Client/Server结构转变成Browser/Server结构后，客户机的压力大大减轻，负荷被均衡地分配给了服务器。由于这种结构不再需要专用的客户端软件，因此也使技术维护人员从繁重的安装、配置和升级等维护工作中解脱了出来，可以把主要精力放在服务器程序的更新工作上。同时，使用Web浏览器作为客户端软件，界面友好，新开发的系统也不需要用户每次都从头学习。而且，这种三层模式，层与层之间相互独立，任何一层的改变都不影响其他层原有的功能，所以可用不同厂家的产品组成性能更佳的系统。总之，三层模式的Browser/Server结构从根本上弥补了传统的二层模式的Client/Server结构的缺陷，是应用系统体系结构中一次深刻的变革。"
        titleList.add(ListResult("<a href=\"https://www.cnblogs.com/misswangxing/p/7852716.html\">什么是B/S架构？什么是C/S架构</a> ", content))
        val content1 = "" +
                "HTTP：超文本传输协议\n" +
                "FTP：文件传输协议\n" +
                "SMPT：简单邮件协议\n" +
                "TELNET：远程终端协议\n" +
                "POP3：邮件读取协议"
        titleList.add(ListResult("<a href=\"https://www.cnblogs.com/unrulywind/p/9093031.html\">java常用的网络协议</a>", content1))
        val content3 = "JAVA SE：主要用在客户端开发\n" +
                "JAVA EE：主要用在web应用程序开发\n" +
                "JAVA ME：主要用在嵌入式应用程序开发"

        titleList.add(ListResult("Java都有那些开发平台", content3))
        val content4 = "JVM：java虚拟机，运用硬件或软件手段实现的虚拟的计算机，Java虚拟机包括：寄存器，堆栈，处理器"
        titleList.add(ListResult("<a href=\"https://www.cnblogs.com/yixianyixian/p/7680321.html\">什么是JVM？java虚拟机包括什么</a>", content4))

        titleList.add(ListResult("Java是否需要开发人员回收内存垃圾吗", content))

        titleList.add(ListResult("什么是JDK？什么是JRE", content))

        titleList.add(ListResult("什么是数据结构", content))

        titleList.add(ListResult("Java的数据结构有那些", content))

        titleList.add(ListResult("什么是OOP", content))

        titleList.add(ListResult("什么是面向对象", content))

        titleList.add(ListResult("类与对象的关系", content))

        titleList.add(ListResult("Java中有几种数据类型", content))

        titleList.add(ListResult("什么是隐式转换，什么是显式转换", content))

        titleList.add(ListResult("Char类型能不能转成int类型？能不能转化成string类型，能不能转成double类型", content))

        titleList.add(ListResult("什么是拆装箱", content))

        titleList.add(ListResult("Java中的包装类都是那些", content))
        titleList.add(ListResult("一个java类中包含那些内容", content))
        titleList.add(ListResult("例如： if(a+1.0=4.0)，这样做好吗", content))
        titleList.add(ListResult("那针对浮点型数据运算出现的误差的问题，你怎么解决", content))

        titleList.add(ListResult("++i与i++的区别", content))

        titleList.add(ListResult("数组实例化有几种方式", content))

        titleList.add(ListResult("Java中各种数据默认值", content))

        titleList.add(ListResult("Java常用包有那些", content))

        titleList.add(ListResult("Java最顶级的父类是哪个", content))

        titleList.add(ListResult("Object类常用方法有那些", content))

        titleList.add(ListResult("Object类常用方法有那些", content))

        titleList.add(ListResult("java中是值传递引用传递", content))

        titleList.add(ListResult("假设把实例化的数组的变量当成方法参数，当方法执行的时候改变了数组内的元素，那么在方法外，数组元素有发生改变吗", content))

        titleList.add(ListResult("实例化数组后，能不能改变数组长度呢", content))

        titleList.add(ListResult("假设数组内有5个元素，如果对数组进行反序，该如何做", content))

        titleList.add(ListResult("形参与实参", content))

        titleList.add(ListResult("构造方法能不能显式调用", content))

        titleList.add(ListResult("构造方法能不能重写？能不能重载", content))

        titleList.add(ListResult("什么是方法重载", content))

        titleList.add(ListResult("内部类与静态内部类的区别", content))

        titleList.add(ListResult("Static关键字有什么作用", content))

        titleList.add(ListResult("Final在java中的作用", content))

        titleList.add(ListResult("Java中操作字符串使用哪个类", content))

        titleList.add(ListResult("StringBuffer，Stringbuilder有什么区别", content))

        titleList.add(ListResult("String str=”aaa”,与String str=new String(“aaa”)一样吗", content))

        titleList.add(ListResult("String str=”aa”,String s=”bb”,String aa=aa+s;一种创建了几个对象", content))

        titleList.add(ListResult("将下java中的math类有那些常用方法", content))

        titleList.add(ListResult("String类的常用方法有那些", content))

        titleList.add(ListResult("判断两个对象是否相同，能使用equlas比较吗", content))

        titleList.add(ListResult("==与equlas有什么区别", content))

        titleList.add(ListResult("如何将字符串反转", content))

        titleList.add(ListResult("面向对象的语言有那些特征", content))

        titleList.add(ListResult("Java中的继承是单继承还是多继承", content))

        titleList.add(ListResult("什么是重写？什么是重载", content))

        titleList.add(ListResult("构造方法能不能重载？能不能重写", content))

        titleList.add(ListResult("如果父类只有有参构造方法，那么子类必须要重写父类的构造方法吗", content))

        titleList.add(ListResult("创建一个子类对象的时候，那么父类的构造方法会执行吗", content))

        titleList.add(ListResult("什么是父类引用指向子类对象", content))

        titleList.add(ListResult("当父类引用指向子类对象的时候，子类重写了父类方法和属性，那么当访问属性的时候，访问是谁的属性？调用方法时，调用的是谁的方法", content))

        titleList.add(ListResult("Super与this表示什么", content))

        titleList.add(ListResult("抽象的关键字是什么", content))

        titleList.add(ListResult("抽象类必须要有抽象方法吗", content))

        titleList.add(ListResult("如果一个类中有抽象方法，那么这个一定是抽象类", content))

        titleList.add(ListResult("抽象类可以使用final修饰吗", content))

        titleList.add(ListResult("普通类与抽象类有什么区别", content))

        titleList.add(ListResult("什么是接口", content))

        titleList.add(ListResult("接口就是某个事物对外提供的一些功能的声明，是一种特殊的java类", content))

        titleList.add(ListResult("JAVA为什么需要接口", content))

        titleList.add(ListResult("接口有什么特点", content))

        titleList.add(ListResult("接口与抽象类有什么区别", content))

        titleList.add(ListResult("Java中异常分为哪两种", content))

        titleList.add(ListResult("说几个常见的编译时异常类", content))

        titleList.add(ListResult("异常的处理机制有几种", content))

        titleList.add(ListResult("如何自定义一个异常", content))

        titleList.add(ListResult("在异常捕捉时，如果发生异常，那么try.catch.finally块外的return语句会执行吗", content))

        titleList.add(ListResult("Try.catch.finally是必须要存在的吗", content))

        titleList.add(ListResult("Thow与thorws区别", content))

        titleList.add(ListResult("Error与Exception区别", content))

        titleList.add(ListResult("使用Log4j对程序有影响吗", content))

        titleList.add(ListResult("Log4j日志有几个级别", content))

        titleList.add(ListResult("除了使用new创建对象之外，还可以用什么方法创建对象", content))

        titleList.add(ListResult("Java反射创建对象效率高还是通过new创建对象的效率高", content))

        titleList.add(ListResult("Java中集合框架的有几个", content))

        titleList.add(ListResult("Collection接口下有那些集合框架", content))

        titleList.add(ListResult("List接口有什么特点", content))

        titleList.add(ListResult("Set接口有什么特点", content))

        titleList.add(ListResult("ArrayList与LinkedList有什么区别", content))

        titleList.add(ListResult("Array与ArrayList有什么不一样", content))

        titleList.add(ListResult("Map有什么特点", content))

        titleList.add(ListResult("JDBC操作的步骤", content))

        titleList.add(ListResult("在使用jdbc的时候，如何防止出现sql注入的问题", content))

        titleList.add(ListResult("怎么在JDBC内调用一个存储过程", content))

        titleList.add(ListResult("是否了解连接池，使用连接池有什么好处", content))

        titleList.add(ListResult("你所了解的数据源技术有那些？使用数据源有什么好处", content))

        titleList.add(ListResult("Java的io流分为哪两种", content))

        titleList.add(ListResult("常用io类有那些", content))

        titleList.add(ListResult("字节流与字符流的区别", content))

        titleList.add(ListResult("final、finalize()、finally", content))

        titleList.add(ListResult("抽象类和接口的区别", content))

        titleList.add(ListResult("线程同步的方法", content))

        titleList.add(ListResult("线程与进程的区别", content))

        titleList.add(ListResult("&和&&的区别", content))

        titleList.add(ListResult("重载与重写", content))

        titleList.add(ListResult("如果对象的引用被置为null，垃圾收集器是否会立即释放对象占用的内存", content))

        titleList.add(ListResult("串行(serial)收集器和吞吐量(throughput)收集器的区别是什么", content))

//        adapter?.updata(titleList)
    }


}