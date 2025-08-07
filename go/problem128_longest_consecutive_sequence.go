// https://leetcode.com/problems/longest-consecutive-sequence

func longestConsecutive(nums []int) int {
    if len(nums) == 0 {
        return 0
    }
    sort.Slice(nums, func(i,j int) bool { return nums[i]<nums[j] })
    count := 1
    result := 1

    for i := 1; i<len(nums); i++ {
        if nums[i] == nums[i-1] {
            continue
        }
        if (nums[i] == (nums[i-1])+1) {
            count++

            result = max(count,result)
        } else {
            count = 1
        }
    }

    return result
}
