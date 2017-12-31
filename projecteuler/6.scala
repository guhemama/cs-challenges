/**
 * Problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
val n = 100

// Sum of the first n numbers
val sum = (n * (n + 1)) / 2
val squaredSum = sum * sum

// Sum of the first n squares
val sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6

val res = squaredSum - sumOfSquares

println(res)