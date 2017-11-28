/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
object Solution {
    def selfDividingNumbers(left: Int, right: Int): List[Int] = {
        left.to(right).toList.filter(isSelfDividing(_))
    }

    def isSelfDividing(number: Int): Boolean = {
        val dividers = number
            .toString
            .map(_.asDigit)

        if (dividers.contains(0)) {
            false
        } else {
            dividers
                .filterNot(number % _ == 0)
                .length == 0
        }
    }
}

assert(Solution.isSelfDividing(128) == true);
assert(Solution.selfDividingNumbers(1, 22) == List(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));