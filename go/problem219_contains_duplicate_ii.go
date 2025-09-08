// https://leetcode.com/problems/contains-duplicate-ii 

func containsNearbyDuplicate(nums []int, k int) bool {
    seen := make(map[int]int)

    for i, num := range nums {
        index, exist := seen[num]
        if exist && i-index<=k {
            return true
        } 
        seen[num] = i
    }

    return false
}
