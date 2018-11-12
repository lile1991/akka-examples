package example.akka

import akka.actor.{Actor, ActorLogging}

class HelloActor extends Actor with ActorLogging {

  override def receive: Actor.Receive =  {
    new PartialFunction[Any, Unit] {
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[String]
      }

      override def apply(v1: Any): Unit = {
         log.info(s"Hello, $v1")
      }
    }
  }
}
