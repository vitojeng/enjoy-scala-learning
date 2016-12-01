import java.util.Date

val s1 = "123"
val s2 = "123"
val s3 = new String("123")
s1 == s2      // true
s2 == s3      // true
s1 eq s2      // true
s2 eq s3      //

val language = "scala"
val dd = new Date()
println( s"Hello, $language" )
println( s"Hello, ${language.toUpperCase}" )
println( f"Hello, $language%s. Time: $dd%tY/$dd%tm/$dd%td" )
println( "first line\nsecond line" )
println( raw"first line\nsecond line" )
