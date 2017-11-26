# 1. Two Sum
# https://leetcode.com/problems/two-sum/description/
def two_sum(nums, target)
    remainders = {}

    nums.each_with_index do |v, k|
        if remainders.key? v
            return [remainders[v], k]
        else
            remainders[target - v] = k
        end
    end

    false
end