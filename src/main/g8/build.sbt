import Dependencies._
import Dependencies.Versions

name := """$name$"""

organization := "$organization$"

version := "1.0-SNAPSHOT"

scalaVersion := Versions.scala

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies ++= dependencies

dependencyUpgradeModuleNames := Map(
  "dryad-consul" -> "dryad",
  "scala-library" -> "scala"
)