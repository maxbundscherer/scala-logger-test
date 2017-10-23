name := "aws-logger-test"
version := "0.1"
scalaVersion := "2.12.4"

val scalaTestVersion: String      = "3.0.4"
val log4jVersion: String          = "1.2.17"
val typeSafeConfigVersion: String = "1.3.1"

libraryDependencies += "org.scalactic" %% "scalactic" % scalaTestVersion
libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
libraryDependencies += "log4j" % "log4j" % log4jVersion
libraryDependencies += "com.typesafe" % "config" % typeSafeConfigVersion

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

dockerEntrypoint := Seq("bin/%s" format executableScriptName.value, "-Dconfig.resource=docker.conf")