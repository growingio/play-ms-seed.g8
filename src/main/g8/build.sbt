import Dependencies.Versions
import Dependencies.dependencies
import sbt.Keys.organization

scalaVersion := Versions.scala

//lazy val `proto` = project

lazy val root = (project in file("."))
  .settings(
    name := """$name$""",
    organization := "$organization$",
    version := "1.0-SNAPSHOT"
  )
  .enablePlugins(PlayScala)
//  .aggregate(proto)
//  .dependsOn(proto)
  .disablePlugins(PlayLogback)

//libraryDependencies += filters
libraryDependencies += guice
libraryDependencies ++= dependencies

dependencyUpgradeModuleNames := Map(
  "grpc-stub" -> "grpc",
  "grpc-netty" -> "grpc",
  "grpc-protobuf" -> "grpc",
  "dryad-consul" -> "dryad",
  "scala-library" -> "scala",
  "play-slick-.*" -> "playSlick"
)

javaOptions += "-Dlog4j.configurationFile=conf/log4j2.xml"
