/**
 * 557. Reverse Words in a String III
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 */
object Solution {
  def reverseWords(s: String): String = {
    s.split(" ").map(_.reverse).mkString(" ")
  }
}

assert(Solution.reverseWords("Let's take LeetCode contest") == "s'teL ekat edoCteeL tsetnoc")