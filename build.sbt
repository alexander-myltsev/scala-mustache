bintrayPublishSettings

name := "mustache"

organization := "com.vspy"

version := "1.2"

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8.1" % "test->default",
  "org.specs2" %% "specs2" % "2.3.12" % "test->default",
  "com.typesafe.akka" %% "akka-actor" % "2.3.3" % "test->default"
)
