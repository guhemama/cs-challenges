# 283. Move Zeroes
# https://leetcode.com/problems/move-zeroes/description/
# Given an array nums, write a function to move all 0's to the end of it while
# maintaining the relative order of the non-zero elements. For example, given
# nums = [0, 1, 0, 3, 12], after calling your function, nums should
# be [1, 3, 12, 0, 0].
def move_zeroes(nums)
  position = 0
  0.upto(nums.length - 1) do |i|
    if nums[i] != 0
      nums[i], nums[position] = nums[position], nums[i]
      position += 1
    end
  end
end
