name := "bootstrap-akka-graphql"
organization := "$package$"
version := "1.0.0"
scalaVersion := Version.Scala

libraryDependencies ++= {
  Seq(
    Library.akkaActor,
    Library.akkaHttp,
    Library.akkaHttpCors,
    Library.akkaHttpSprayJson,
    Library.akkaStream,
    Library.log4jCore,
    Library.slf4jLog4jBridge,
    Library.akkaLog4j,
    Library.slick,
    Library.slickHikaricp,
    Library.postgresql,
    Library.slickRepo,
    Library.flywaydb,
    Library.nimbusds,
    Library.sangria,
    Library.sangriaSprayJson,
    TestLibrary.akkaTestkit,
    TestLibrary.akkaHttpTestkit,
    TestLibrary.postgresqlEmbedded,
    TestLibrary.scalaTest
  )
}

Revolver.settings
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

dockerExposedPorts := Seq(8080)
dockerEntrypoint := Seq("bin/%s" format executableScriptName.value, "-Dconfig.resource=docker.conf")
