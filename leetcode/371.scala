/**
 * 371. Sum of Two Integers
 * https://leetcode.com/problems/sum-of-two-integers/description/
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use
 * the operator + and -.
 *
 * First, we XOR the numbers. Then, we AND them and shift the bits one bit to
 * the left.
 */
object Solution {
  def getSum(a: Int, b: Int): Int = {
    def bitSum(a: Int, b: Int): Int = b match {
      case 0 => a
      case _ => bitSum(a ^ b, (a & b) << 1)
    }

    bitSum(a, b)
  }
}

assert(Solution.getSum(1, 2) == 3)
assert(Solution.getSum(125656, 22511) == 148167)