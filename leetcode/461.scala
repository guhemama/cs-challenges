/**
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/description/
 *
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different. Given two integers x and y,
 * calculate the Hamming distance.
 */
object Solution {
  def hammingDistance(x: Int, y: Int): Int = {
    Integer.bitCount(x ^ y)
  }
}

assert(Solution.hammingDistance(1, 4) == 2)
assert(Solution.hammingDistance(3, 1) == 1)
assert(Solution.hammingDistance(4, 2) == 2)