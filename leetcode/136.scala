/**
 * 136. Single Number
 * https://leetcode.com/problems/single-number/discuss/
 *
 * XOR is useful in this case: when the inputs are the same, it yields false;
 * when the inputs are different, it yields true. In this case, while folding,
 * it will return 0 for numbers that repeat, and N for the number that does not
 * repeat.
 */
object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        nums.fold(0)(_ ^ _)
    }
}

assert(Solution.singleNumber(Array(1,2,3,2,3,4,4)) == 1)