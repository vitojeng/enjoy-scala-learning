
val manyObjects: Seq[Any] = Seq("scala", "2.11.8",
  18, 120, 1.5)

manyObjects.foreach { x =>
  val message = x match {
    case i: Int if i < 100 => "(int)(less than 100) " + i
    case j: Int => "(int) " + j
    case "scala" => "scala !!"
    case s: String => "(string) " + s
    case _ => "(not handle) " + x
  }
  println(message)
}

