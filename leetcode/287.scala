/**
 * 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 *
 * Given an array nums containing n + 1 integers where each integer is between
 * 1 and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 */
object Solution {
  def findDuplicate(nums: Array[Int]): Int = {
    nums.diff(nums.distinct)(0)
  }
}

assert(Solution.findDuplicate(Array(1,2,3,4,5,6,1,7,9)) == 1)