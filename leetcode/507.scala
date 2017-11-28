/**
 * 507. Perfect Number
 * https://leetcode.com/problems/perfect-number/description/
 *
 * We define the Perfect Number is a positive integer that is equal to the sum
 * of all its positive divisors except itself.
 */
import scala.collection.immutable.Vector

object Solution {
    /**
     * This solution does not scale. I should look into prime factorization to
     * solve this faster...
     */
    def checkPerfectNumber(num: Int): Boolean = {
        if (num > 0) {
            Vector.range(1, num - 1)
                .filter(num % _ == 0)
                .sum == num
        } else {
            false
        }
    }
}

assert(Solution.checkPerfectNumber(28) == true)
assert(Solution.checkPerfectNumber(2)  == false)