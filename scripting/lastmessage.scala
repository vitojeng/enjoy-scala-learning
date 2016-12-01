#!/usr/bin/env scala

import java.net.URLConnection

val myToken = ""    // Important: Must setup your token first from Gitter website.
val scalaTaiwanRoomId = "5662881116b6c7089cbd7c50"

val requestProperties = Map(
  "Accept" -> "application/json",
  "Authorization" -> s"Bearer $myToken"
)

def connection(requestProps: Map[String, String]): String => URLConnection =
  (url: String) => {
    val connection = new java.net.URL(url).openConnection
    requestProps.foreach { case (name, value) =>
      connection.setRequestProperty(name, value)
    }
    connection
  }


def lastGitterChatMessage(roomId: String) = {
  val gitterApiUrl = s"https://api.gitter.im/v1/rooms/$roomId/chatMessages?limit=1"
  val conn = connection(requestProperties)(gitterApiUrl)
  scala.io.Source.fromInputStream(conn.getInputStream).mkString
}

println( lastGitterChatMessage(scalaTaiwanRoomId) )
