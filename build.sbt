name         := "aws-statika"
organization := "com.miodx.common"
version      := "2.0.0"
description  := "An EC2-based statika environment"

bucketSuffix := "era7.com"

crossScalaVersions := Seq("2.11.11", "2.12.3")
scalaVersion  := "2.11.11"

libraryDependencies ++= Seq(
  "com.miodx.common" %% "statika" 	       % "3.0.0",
  "com.miodx.common" %% "aws-scala-tools"  % "0.19.0",
  "org.scalatest"    %% "scalatest"        % "3.0.4" % Test
)
