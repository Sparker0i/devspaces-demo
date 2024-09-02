name := "Custom-Test"
version := "0.1"

scalaVersion := "2.13.14"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "3.5.2" % "provided",
    "org.apache.spark" %% "spark-sql" % "3.5.2" % "provided",
)

Compile / unmanagedClasspath += file("/opt/spark/jars")