# 191. Reverse Bits
# https://leetcode.com/problems/reverse-bits/description/
#
# Reverse bits of a given 32 bits unsigned integer.
#
# For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
# return 964176192 (represented in binary as 00111001011110000010100101000000).
require 'test/unit'
extend Test::Unit::Assertions

def reverse_bits(n)
    n.to_s(2).rjust(32, "0").reverse.to_i(2)
end

assert_equal reverse_bits(43261596), 964176192