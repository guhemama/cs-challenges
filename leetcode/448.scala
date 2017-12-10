/**
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/discuss/
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once. Find all the elements of [1, n]
 * inclusive that do not appear in this array.
 */
import scala.collection.mutable.Set

object Solution {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    nums.length match {
      case 0 => List()
      case _ => {
        val completeSet = 1.to(nums.length).to[Set]

        nums.foreach { n: Int =>
          completeSet -= n
        }

        completeSet.toList
      }
    }
  }
}

assert(Solution.findDisappearedNumbers(Array(4,3,2,7,8,2,3,1)) == List(5, 6))
assert(Solution.findDisappearedNumbers(Array()) == List())
assert(Solution.findDisappearedNumbers(Array(1, 1)) == List(2))