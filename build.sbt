name         := "aws-statika"
organization := "com.miodx.common"
version      := "2.0.2"
description  := "An EC2-based statika environment"

bucketSuffix := "era7.com"

scalaVersion  := "2.12.8"

libraryDependencies ++= Seq(
  "com.miodx.common" %% "statika" 	       % "3.0.0",
  "com.miodx.common" %% "aws-scala-tools"  % "0.21.0",
  "org.scalatest"    %% "scalatest"        % "3.0.4" % Test
)
