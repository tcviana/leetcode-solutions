// https://leetcode.com/problems/jump-game

func canJump(nums []int) bool {
    maxJump := 0

    for i:=0; i<len(nums); i++ {
        if (i>maxJump) {
            return false
        }
        maxJump = max(maxJump, i+nums[i])
    }
    return true
}
