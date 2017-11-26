/**
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */
object Solution {
    def firstUniqChar(s: String): Int = {
        val distinctChars = s.distinct.toVector.filter(a => s.count(b => a == b) == 1)

        if (distinctChars.length == 0) -1
        else s.indexOf(distinctChars(0))
    }
}

assert(Solution.firstUniqChar("leetcode") == 0)
assert(Solution.firstUniqChar("loveleetcode") == 2)
assert(Solution.firstUniqChar("abba") == -1)