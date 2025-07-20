// https://leetcode.com/problems/rotate-array

func rotate(nums []int, k int)  {
    size := len(nums)
    k = k%size

    if k <= 0 || size < 2 {
        return
    }

    // revert all
    for i,j := 0, size-1; i<j; i,j = i+1, j-1 {
        nums[i], nums[j] = nums[j], nums[i]
    }

    // revert request
    for i,j := 0, k-1; i<j; i,j = i+1, j-1 {
        nums[i], nums[j] = nums[j], nums[i]
    }

    // revert rest
    for i,j := k, size-1; i<j; i,j = i+1, j-1 {
        nums[i], nums[j] = nums[j], nums[i]
    }
    
}
