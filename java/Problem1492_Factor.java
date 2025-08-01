// https://leetcode.com/problems/the-kth-factor-of-n/?envType=study-plan-v2&envId=amazon-spring-23-high-frequency

class Solution {
    public int kthFactor(int n, int k) {
        for (int i = 1; i<=n; i++) {
            int result = n%i;
            if (result==0) 
                k--;
            if (k==0)
                return i;
        }
        return -1;
    }
}
