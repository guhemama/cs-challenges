/**
 * Problem 4
 * Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Solution extends App {
  def isPalindrome(n: Int): Boolean = n.toString == n.toString.reverse

  var current: Int = 123

  for (x <- 999 to 100 by -1; y <- 999 to 100 by -1) {
    val product = x * y

    if (isPalindrome(product) && product > current) {
      current = product
    }
  }

  println(current)
}