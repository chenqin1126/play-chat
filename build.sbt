name := "playChat"

version := "1.0"

lazy val `playchat` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(jdbc, cache, ws, specs2 % Test, "com.typesafe.play" %% "anorm" % "2.5.0")

libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.8.6"


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  