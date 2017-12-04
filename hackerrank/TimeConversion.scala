/**
 * Time Conversion.
 * https://www.hackerrank.com/challenges/time-conversion/problem
 * Given a time in -hour AM/PM format, convert it to military (-hour) time.
 */
object Solution {
    def timeConversion(s: String): String =  {
        val hour = s.slice(0, 2).toInt

        val newHour = s.takeRight(2) match {
            case "AM" => if (hour == 12) 0 else hour
            case "PM" => if (hour < 12) hour + 12 else hour
        }

        f"${newHour}%02d" + s.drop(2).dropRight(2)
    }
}

assert(Solution.timeConversion("12:00:00AM") == "00:00:00")
assert(Solution.timeConversion("12:15:00PM") == "12:15:00")
assert(Solution.timeConversion("07:05:45PM") == "19:05:45")