/**
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/description/
 *
 * Write a function that takes a string as input and returns the string reversed.
 */
object Solution {
    def reverseString(s: String): String = s match {
        case "" => ""
        case _ => reverseString(s.tail) + s.head
    }
}

assert(Solution.reverseString("abc def") == "fed cba");