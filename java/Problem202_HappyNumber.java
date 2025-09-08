// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {  
        Set<Integer> seen = new HashSet<>();

        // evict loop
        while (n!=1 && !seen.contains(n)) {
            seen.add(n);
            n = sumPairs(n);
        }    
        return n==1;
    }

    private int sumPairs(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n%10;
            sum += num*num;
            n /= 10;
        }
        return sum;
    }
}
