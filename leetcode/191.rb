# 191. Number of 1 Bits
# https://leetcode.com/problems/number-of-1-bits/description/
#
# Write a function that takes an unsigned integer and returns the number of 1
# bits it has (also known as the Hamming weight).
#
# For example, the 32-bit integer 11 has binary representation
# 00000000000000000000000000001011, so the function should return 3.
require 'test/unit'
extend Test::Unit::Assertions

def hamming_weight(n)
    n.to_s(2).chars.select { |c| c.to_i == 1 }.length
end

assert_equal hamming_weight(11), 3