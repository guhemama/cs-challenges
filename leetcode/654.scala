/**
 * 654. Maximum Binary Tree
 * https://leetcode.com/problems/maximum-binary-tree/description/
 */
case class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null

    override def toString() = value.toString + s"\nL: ${Option(left).getOrElse("")} R: ${Option(right).getOrElse("")}"
}

object Solution {
    def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
        def buildTreeNode(left: Int, right: Int): TreeNode = {
            if (left == right) {
                null
            } else {
                val index    = maxIndex(left, right)
                val node     = TreeNode(nums(index))
                node.left    = buildTreeNode(left, index)
                node.right   = buildTreeNode(index + 1, right)
                node
            }
        }

        def maxIndex(left: Int, right: Int): Int = {
            var max = left

            for (i <- left until right if left <= right) {
                if (nums(i) > nums(max)) {
                    max = i
                }
            }

            max
        }

        buildTreeNode(0, nums.length)
    }
}

println(Solution.constructMaximumBinaryTree(Array(3,2,1,6,0,5)))