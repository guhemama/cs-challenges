/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Assume we are dealing with an environment which could only hold integers
 * within the 32-bit signed integer range. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */
 object Solution {
  def reverse(x: Int): Int = {
    try {
      val sign = if (x < 0) -1 else 1
      math.abs(x).toString.reverse.toInt * sign
    } catch {
      case _: Throwable => 0
    }
  }
}

assert(Solution.reverse(-532) == -235)
assert(Solution.reverse(494) == 494)
assert(Solution.reverse(2147483647) == 0)