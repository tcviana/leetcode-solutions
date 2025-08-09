// https://leetcode.com/problems/triangle/description/

func minimumTotal(triangle [][]int) int {

	lines := len(triangle)
	// create a dynamic programming table and copy the last line
	dp := make([]int, len(triangle[lines-1]))
	copy(dp, triangle[lines-1])

	// down to up
	for i := lines - 2; i >= 0; i-- {
		for j := 0; j < len(triangle[i]); j++ {
			// dp[j] and dp[j+1] are two possibles path
			if dp[j] < dp[j+1] {
				dp[j] = triangle[i][j] + dp[j]
			} else {
				dp[j] = triangle[i][j] + dp[j+1]
			}
		}
	}
	return dp[0]
}
