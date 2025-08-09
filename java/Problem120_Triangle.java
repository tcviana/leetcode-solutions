// https://leetcode.com/problems/triangle

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Copia a última linha como base
        int[] dp = new int[triangle.get(triangle.size() - 1).size()];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = triangle.get(triangle.size() - 1).get(i);
        }

        // De baixo para cima
        for (int row = triangle.size() - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        return dp[0];
    }
}
