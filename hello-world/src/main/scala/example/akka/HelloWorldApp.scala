package example.akka

import akka.actor.{ActorRef, ActorSystem, Props}

import scala.io.StdIn

object HelloWorldApp {
  def main(args: Array[String]) : Unit = {
    // 根actor
    val system = ActorSystem.create("hello-system")

    try  {
      // 子actor
      val lotActor = system.actorOf(Props.create(classOf[HelloActor], () => new HelloActor()))

      println("lotActor.tell `光头强`")
      lotActor.tell("光头强 ", ActorRef.noSender)

      StdIn.readLine()
    }
    finally  system.terminate() // 终止ActorSystem
  }
}
