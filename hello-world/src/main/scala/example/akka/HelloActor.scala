package example.akka

import akka.actor.{Actor, ActorLogging}

/**
  * Actor实现类
  */
class HelloActor extends Actor with ActorLogging {

  override def receive: Actor.Receive =  {
    new PartialFunction[Any, Unit] {
      /**
        * 是否执行apply
        * @param x actor.tell()方法传递的参数
        * @return 返回true才会执行apply方法
        */
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[String]
      }

      /**
        * 将要执行的操作放在这
        * @param x actor.tell()方法传递的参数
        */
      override def apply(x: Any): Unit = {
         log.info(s"Hello, $x")
      }
    }
  }
}
