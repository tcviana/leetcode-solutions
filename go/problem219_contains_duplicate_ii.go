// https://leetcode.com/problems/contains-duplicate-ii 

func containsNearbyDuplicate(nums []int, k int) bool {
    window := make(map[int]struct{})

    for i, num := range nums {
        if _, exists := window[num]; exists {
            return true
        } 
        window[num] = struct{}{}

        if len(window) > k {
            delete(window, nums[i-k])    
        }
    }

    return false
}
