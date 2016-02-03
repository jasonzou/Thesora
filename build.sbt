name := """Thesora"""

version := "1.0.13"

// play with scala
lazy val root = (project in file(".")).enablePlugins(PlayScala)

// set scala version
scalaVersion := "2.11.7"

// basic library dependencies
// jdbc, cache, ws(web services)
libraryDependencies ++= Seq(
  cache,
  ws
)

sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.4.188",
  "com.typesafe.play" %% "play-slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.0.1",
  "org.elasticsearch" % "elasticsearch" % "1.7.1",
  "org.webjars" %% "webjars-play" % "2.4.0",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "angularjs" % "1.4.4",
  "org.webjars" % "angular-ui-bootstrap" % "0.13.3",
  "org.webjars" % "font-awesome" % "4.4.0",
  "jp.t2v" %% "play2-auth"        % "0.14.1",
  //"jp.t2v" %% "play2-auth-social" % "0.14.1", // for social login
  "org.specs2" %% "specs2-core" % "3.6.4" % "test",
  "org.specs2" %% "specs2-junit" % "3.6.4" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.6.4" % "test"

)

TwirlKeys.templateImports ++= Seq(
        "play.api.data.Form",
        "play.api.mvc.Flash",
        "views._",
        "views.html.helper",
        "controllers._"
      )



// sbt-web
pipelineStages := Seq(rjs, gzip, digest)

//pipelineStages in Assets := Seq()

//pipelineStages := Seq(rjs, gzip, digest)

//DigestKeys.algorithms += "sha1"

//fork in run := true

//routesGenerator := InjectedRoutesGenerator
PlayKeys.playOmnidoc := false

//fork in run := true
