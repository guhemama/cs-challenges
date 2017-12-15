/**
 * 657. Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/description/
 *
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
 * judge if this robot makes a circle, which means it moves back to the original
 * place.
 *
 * The move sequence is represented by a string. And each move is represent by a
 * character. The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 */
object Solution {
  def judgeCircle(moves: String): Boolean = {
    moves.foldLeft((0, 0))((coords, dir) => walk(coords, dir)) == (0, 0)
  }

  def walk(coords: (Int, Int), dir: Char): (Int, Int) = dir match {
    case 'U' => (coords._1, coords._2 + 1)
    case 'D' => (coords._1, coords._2 - 1)
    case 'L' => (coords._1 - 1, coords._2)
    case 'R' => (coords._1 + 1, coords._2)
  }
}

assert(Solution.judgeCircle("UD") == true)
assert(Solution.judgeCircle("LL") == false)
assert(Solution.judgeCircle("RLUURDDDLU") == true)