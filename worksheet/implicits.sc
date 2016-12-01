import java.util.{Calendar, Date}

implicit class DateConvert(val date: Date) {
  private def cloneDate(date: Date, f: Calendar => Unit) = {
    val cal = Calendar.getInstance()
    cal.setTime(date)
    f(cal)
    cal.getTime
  }
  def firstDayOfMonth() = cloneDate(date,  _.set(Calendar.DAY_OF_MONTH, 1) )
  def firstDayOfWeek() = cloneDate(date, _.set(Calendar.DAY_OF_WEEK, 1) )
}

val mydate = new Date()
println( mydate )
println( mydate.firstDayOfMonth() )
println( mydate.firstDayOfWeek() )

