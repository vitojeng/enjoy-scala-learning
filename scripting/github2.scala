import org.json4s.JValue
#!/usr/bin/env amm

import $ivy.`org.json4s::json4s-native:3.5.0`
import org.json4s.JsonAST.JValue
import org.json4s._
import org.json4s.native.JsonMethods._

@main
def main(account: String) = {
  println(s"Github account: $account")

  val userRepo = s"https://api.github.com/users/$account/repos"

  val json: JValue = parse(scala.io.Source.fromURL(userRepo).mkString)

  val names = (json \\ "full_name").children map {
    case JString(s) => s
    case _ =>
  }

  names.foreach(println)
}
