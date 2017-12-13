# 338. Counting Bits
# https://leetcode.com/problems/counting-bits/description/
#
# Given a non negative integer number num. For every numbers i in the range
# 0 ≤ i ≤ num calculate the number of 1's in their binary representation and
# return them as an array.
def count_bits(num)
  0.upto(num).map do |n|
    n.to_s(2).count("1")
  end
end