import sbt._

object Dependencies {

  object Versions {
    val slick = "3.2.3"
    val grpc = "1.14.0"
    val scala = "2.12.6"
    val log4j2 = "2.11.1"
    val slickPg = "0.16.3"
    val playSlick = "3.0.3"
    val grpcStub = "1.14.0"
    val playTest = "2.6.17"
    val twirlApi = "1.3.15"
    val playGuice = "2.6.17"
    val grpcNetty = "1.14.0"
    val playServer = "2.6.17"
    val playOmnidoc = "2.6.17"
    val grpcServices = "1.14.0"
    val grpcProtobuf = "1.14.0"
    val dryad = "1.1.0-SNAPSHOT"
    val micros = "1.0.0-SNAPSHOT"
    val filtersHelpers = "2.6.17"
    val postgresql = "42.2.4.jre7"
    val scalatestplusPlay = "$scalatestplusplay_version$"
    val playAkkaHttpServer = "2.6.17"
    val playSlickEvolutions = "3.0.3"
    val playZipkinTracingPlay = "2.1.0"
  }

  object Compiles {
    val playSlick = Seq(
      "com.typesafe.play" %% "play-slick" % Versions.playSlick,
      "com.typesafe.play" %% "play-slick-evolutions" % Versions.playSlick)
    val slickPg = Seq(
      "com.github.tminglei" %% "slick-pg" % Versions.slickPg,
      "com.github.tminglei" %% "slick-pg_joda-time" % Versions.slickPg,
      "com.github.tminglei" %% "slick-pg_play-json" % Versions.slickPg)
    val dryad = "io.growing" %% "dryad-consul" % Versions.dryad
    val slick = "com.typesafe.slick" %% "slick" % Versions.slick
    val postgresql = "org.postgresql" % "postgresql" % Versions.postgresql
    val micros = "io.growing.micros" %% "growing-micros" % Versions.micros
    val grpc = Seq(
      "io.grpc" % "grpc-stub" % Versions.grpc,
      "io.grpc" % "grpc-netty" % Versions.grpc,
      "io.grpc" % "grpc-services" % Versions.grpc,
      "io.grpc" % "grpc-protobuf" % Versions.grpc)
    val zipkinTracing = "jp.co.bizreach" %% "play-zipkin-tracing-play" % Versions.playZipkinTracingPlay
  }

  val log4j2 = Seq(
    "org.apache.logging.log4j" % "log4j-slf4j-impl" % Versions.log4j2,
    "org.apache.logging.log4j" % "log4j-api" % Versions.log4j2,
    "org.apache.logging.log4j" % "log4j-core" % Versions.log4j2)

  object Tests {
    val scalatestPlus = "org.scalatestplus.play" %% "scalatestplus-play" % Versions.scalatestplusPlay % Test
  }

  import Compiles._

  lazy val dependencies: Seq[sbt.ModuleID] =
    grpc ++
      slickPg ++
      playSlick ++
      ravenLog4j2 ++
      Seq(dryad, slick, micros, postgresql, zipkinTracing, Tests.scalatestPlus)

}
