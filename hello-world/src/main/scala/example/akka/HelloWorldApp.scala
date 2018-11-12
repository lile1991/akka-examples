package example.akka

import akka.actor.{ActorRef, ActorSystem, Props}

import scala.io.StdIn

object HelloWorldApp {
  def main(args: Array[String]) : Unit = {
    val system = ActorSystem.create("hello-system")

    try  {
      val lotActor = system.actorOf(Props.create(classOf[HelloActor], () => new HelloActor()))
      lotActor.tell("光头强 ", ActorRef.noSender)
      StdIn.readLine()
    }
    finally  system.terminate()
  }
}
