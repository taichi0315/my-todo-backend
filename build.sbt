lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.play"    %% "play-slick"               % "4.0.2",
  "com.typesafe.play"    %% "play-slick-evolutions"    % "4.0.2",
  "mysql"                 % "mysql-connector-java"     % "5.1.48",
  guice
)