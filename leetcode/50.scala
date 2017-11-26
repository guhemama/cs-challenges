/**
 * 50. Pow(x, n)
 * https://leetcode.com/problems/powx-n/description/
 *
 * Implement pow(x, n).
 */
object Solution {
    /**
     * Recursive solution
     */
    def myRecursivePow(x: Double, n: Int): Double = {
        def recPow(acc: Double, power: Int): Double = {
            if (power == 0) 1
            else acc * x * recPow(acc, power - 1)
        }

        if (x == 1) x
        else if (n == 0) 1
        else if (n > 0) recPow(1, math.abs(n))
        else 1 / recPow(1, math.abs(n))
    }

    /**
     * Iterative solution
     */
    def myPow(x: Double, n: Int): Double = {
        if (x == 1) x
        else if (n == 0) 1
        else {
            var result: Double = 1
            val rng: Int = math.abs(n)

            1 to rng foreach { _ =>
                result = result * x
            }

            if (n > 0) result
            else 1 / result
        }
    }
}

assert(Solution.myRecursivePow(2, 10) == 1024)
assert(Solution.myRecursivePow(2, 20) == 1048576)
assert(Solution.myRecursivePow(2, -3) == 0.125)

assert(Solution.myPow(2, 10) == 1024)
assert(Solution.myPow(2, 20) == 1048576)
assert(Solution.myPow(2, -3) == 0.125)