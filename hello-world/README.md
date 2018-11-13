### 第一个Akka例子

1. 下载SBT, 并配置环境变量PATH  
https://sbt-downloads.cdnedge.bluemix.net/releases/v1.2.6/sbt-1.2.6.tgz

3.编译： sbt compile

3.运行： sbt run


运行结果：
```
[info] Running example.akka.HelloWorldApp
lotActor.tell `光头强`
[INFO] [11/13/2018 10:30:22.378] [hello-system-akka.actor.default-dispatcher-2] [akka://hello-system/user/$a] Hello, 光头强
```