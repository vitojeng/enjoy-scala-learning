
scalaVersion := "2.11.8"

resolvers += Resolver.url("typesafe-ivy-repo", url("http://repo.typesafe.com/typesafe/releases"))(Resolver.ivyStylePatterns)

libraryDependencies += "org.scala-sbt" % "io" % "0.13.13"
libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.0"