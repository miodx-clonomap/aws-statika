name         := "aws-statika"
organization := "com.miodx.common"
version      := "2.1.0-SNAPSHOT"
description  := "An EC2-based statika environment"

bucketSuffix := "era7.com"

crossScalaVersions := Seq("2.11.12", "2.12.4")
scalaVersion  := "2.11.11"

libraryDependencies ++= Seq(
  "com.miodx.common" %% "statika" 	       % "3.0.0",
  "com.miodx.common" %% "aws-scala-tools"  % "0.19.0",
  "org.scalatest"    %% "scalatest"        % "3.0.4" % Test
)
