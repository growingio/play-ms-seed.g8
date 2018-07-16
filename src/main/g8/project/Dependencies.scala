import sbt._

object Dependencies {

  object Versions {
    val scala = "2.12.6"
    val dryad = "1.1.0-SNAPSHOT"
    val scalatestplusPlay = "$scalatestplusplay_version$"
  }

  object Compile {
    val dryad = "io.growing" %% "dryad-consul" % Versions.dryad
  }

  object Tests {
    val scalatestPlus = "org.scalatestplus.play" %% "scalatestplus-play" % Versions.scalatestplusPlay % Test
  }

  import Compile._

  lazy val dependencies = Seq(dryad, Tests.scalatestPlus)

}
