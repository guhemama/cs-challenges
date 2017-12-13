/**
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/description/
 *
 * Given a non negative integer number num. For every numbers i in the range
 * 0 ≤ i ≤ num calculate the number of 1's in their binary representation and
 * return them as an array.
 */
object Solution {
  def countBits(num: Int): List[Int] = {
    0.to(num).map { i => i.toBinaryString.count(_ == '1') }.toList
  }
}

assert(Solution.countBits(5) == List(0,1,1,2,1,2))