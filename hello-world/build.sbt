name := "hello-world"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.18",
  "com.typesafe.akka" %% "akka-remote" % "2.5.18"
)

//resolvers += "aliyun maven" at " http://maven.aliyun.com/mvn/view"