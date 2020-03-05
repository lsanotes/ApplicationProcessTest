# Q： 一个 Android 程序运行的时候 Application 的 onCreate 方法会走几遍？

# A: 有多少进程就会走多少遍


@All
[太阳] 为了增强群员相互了解，促进相互交谈，本群特别设立「每日一问」的话题讨论环节，主要是技术相关的问题，希望大家踊跃参与讨论。
如果你有问题想要大家集中讨论，也欢迎私聊我哦~

【今日份每日一问】
一个 Android 程序运行的时候 Application 的 onCreate 方法会走几遍？

——————————————————————

一般情况下，一个 App 运行只会触发一次 Application 的 onCreate 方法。但是如果 App 使用到了多进程相关的内容，那么每个进程都会触发一次 Application 的 onCreate 方法。

多进程的使用场景：

进程是系统分配资源和调度的基本单位，多进程应用比单一进程应用的最大可分配内存会成倍增加，这样就可以把加载大图之类非常消耗内存的模块单独分配一个进程。
子进程崩溃主进程可以继续工作，这样可以把后台下载服务、热更新服务单独分配一个进程。

主进程退出子进程仍然可以继续工作，这样可以把推送服务放到子进程中。

如何区分当前是主进程还是子进程：

1. 通过 android.os.Process.myPid() 获取到当前进程的 pid
2. 通过 ActivityManager 的 getRunningAppProcesses() 获取所有进程的信息，轮询对比获取当前进程的进程名
3. 将当前进程名与主进程名对比


https://blog.csdn.net/qijinglai/article/details/81163574 一张图搞定，Activity的启动流程
