name := "resy-booking-bot"

scalaVersion := "2.13.11"

updateOptions := updateOptions.value.withCachedResolution(true)

ThisBuild / scalafixDependencies ++= Seq(
  "com.github.vovapolu" %% "scaluzzi"         % "0.1.23",
  "org.scalatest"       %% "autofix"          % "3.1.0.1",
  "com.eed3si9n.fix"    %% "scalafix-noinfer" % "0.1.0-M1"
)

val root = Project("resy-booking-bot", file("."))
  .settings(
    semanticdbEnabled := true,
    scalacOptions += "-Ywarn-unused",
    libraryDependencies ++= Seq(
      "com.typesafe.play"        %% "play-ahc-ws"     % "2.8.20",
      "com.github.pureconfig"    %% "pureconfig"      % "0.17.4",
      "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0",
      "org.apache.logging.log4j"  % "log4j-core"      % "2.20.0" % Runtime,
      "org.scalatest"            %% "scalatest"       % "3.2.16" % Test,
      "org.mockito"               % "mockito-core"    % "5.4.0"  % Test,
      "org.slf4j"                 % "slf4j-nop"       % "2.0.7"
      // The above removes failed to load class warning
    ),
    publish := {},
    publishLocal := {}
  )
