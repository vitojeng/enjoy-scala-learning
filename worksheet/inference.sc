case class Person(name: String, age: Int)

val (i, f, s) = (100, 99.0, "Hello")
val list = List(1, 2, 3, 4, 5)
val people = Seq(Person("john", 40), Person("jack", 28), Person("ann", 24))

val youngPeople = people.filter { case Person(n,a) => a <= 30 }
