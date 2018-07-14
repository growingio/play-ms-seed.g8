import sbt._

object Dependencies {

  object Versions {
    val config = "1.3.3"
    val scala212 = "2.12.6"
    val scalatest = "3.0.5"
    val scala211 = "2.11.11"
  }

  object Compile {
    val config = "com.typesafe" % "config" % Versions.config
  }

  object Test {
    val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % Versions.scalatest % "test"
  }

  import Compile._

  lazy val dependencies = Seq(config, Test.scalaTest)

}
