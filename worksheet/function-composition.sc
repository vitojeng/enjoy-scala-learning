def f1(s: String) = "f(" + s + ")"
def g1(s: String) = "g(" + s + ")"

val fcg1 = f1 _ compose g1 _
println( fcg1("vito") )

//--------------------------------------

val f2 = (s: String) => "f(" + s +")"
val g2 = (s: String) => "g(" + s +")"
val fcg2 = f2 compose g2

println(fcg2("vito"))

