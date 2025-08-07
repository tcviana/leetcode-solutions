// https://leetcode.com/problems/longest-consecutive-sequence

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return len(nums)

        nums = sorted(nums)  # precisa guardar o resultado
        count = 1
        max_count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                continue
            if nums[i] == nums[i - 1] + 1:
                count += 1
            else:
                count = 1
            max_count = max(max_count, count)

        return max_count
