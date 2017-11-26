/**
 * 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/description/
 */
object Solution {
    def fizzBuzz(n: Int): List[String] = {
        val buf = scala.collection.mutable.ListBuffer.empty[String]

        1 to n foreach { i =>
            if (i % 15 == 0) buf += "FizzBuzz"
            else if (i % 3 == 0) buf += "Fizz"
            else if (i % 5 == 0) buf += "Buzz"
            else buf += i.toString
        }

        buf.toList
    }
}

println(Solution.fizzBuzz(15))