#!/usr/bin/env scalas

/***

scalaVersion := "2.11.8"

resolvers += Resolver.url("typesafe-ivy-repo", url("http://repo.typesafe.com/typesafe/releases"))(Resolver.ivyStylePatterns)

libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.0"

fork in run := true

outputStrategy := Some(StdoutOutput)

*/

import org.json4s._
import org.json4s.native.JsonMethods._

if (args.isEmpty) {
  Console.err.println("Please input github account.")
  sys.exit(0)
}

val account = args(0)
val userRepo = s"https://api.github.com/users/$account/repos"

println(s"Github account: $account")
val json = parse(scala.io.Source.fromURL(userRepo).mkString)

val names = (json \\ "full_name").children map {
  case JString(s) => s
  case _ =>
}

names.foreach(println)
