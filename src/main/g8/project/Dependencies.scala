import sbt._

object Version {
  final val akka = "2.5.19"
  final val akkaHttp = "10.1.7"
  final val akkaHttpSprayJson =  "10.0.9"
  final val Scala = "2.12.8"
  final val AkkaLog4j = "1.4.0"
  final val Log4j = "2.8.2"
  final val akkaHttpCors = "0.3.4"
  final val slickRepo = "1.4.3"
  final val postgresql = "9.4-1206-jdbc42"
  final val nimbusds = "6.7"
  final val slick = "3.2.0"
  final val flyway = "3.2.1"
  final val sangriaSprayJson = "1.0.0"
  final val sangria = "1.4.2"
}

object Library {

  val akkaHttp = "com.typesafe.akka" %% "akka-http" % Version.akkaHttp
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % Version.akka
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % Version.akka
  val akkaHttpCors = "ch.megard" %% "akka-http-cors" % Version.akkaHttpCors
  val akkaHttpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % Version.akkaHttpSprayJson

  val log4jCore = "org.apache.logging.log4j" % "log4j-core" % Version.Log4j
  val slf4jLog4jBridge = "org.apache.logging.log4j" % "log4j-slf4j-impl" % Version.Log4j
  val akkaLog4j = "de.heikoseeberger" %% "akka-log4j" % Version.AkkaLog4j

  val slick = "com.typesafe.slick" %% "slick" % Version.slick
  val slickHikaricp = "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0"
  val postgresql =  "org.postgresql" % "postgresql"% Version.postgresql
  val slickRepo =  "com.byteslounge" %% "slick-repo" % Version.slickRepo
  val flywaydb = "org.flywaydb" % "flyway-core" % Version.flyway

  val nimbusds = "com.nimbusds" % "nimbus-jose-jwt" % Version.nimbusds

  val sangriaSprayJson = "org.sangria-graphql" %% "sangria-spray-json" % Version.sangriaSprayJson
  val sangria = "org.sangria-graphql" %% "sangria" % Version.sangria


}

object TestVersion {
  final val akkaTestkit = "2.5.3"
  final val akkaHttpTestkit =  "10.0.9"
  final val postgresqlEmbedded = "2.2"
  final val scalaTest = "3.0.1"
}

object TestLibrary {
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % TestVersion.akkaTestkit % "test"
  val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit" % TestVersion.akkaHttpTestkit % "test"
  val postgresqlEmbedded = "ru.yandex.qatools.embed" % "postgresql-embedded" % TestVersion.postgresqlEmbedded % "test"
  val scalaTest = "org.scalatest" %% "scalatest" % TestVersion.scalaTest % "test"
}
