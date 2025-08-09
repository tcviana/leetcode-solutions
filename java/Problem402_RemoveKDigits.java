// 
// https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
        int size = num.length();

        StringBuilder prefix = new StringBuilder();
        int minor = Integer.parseInt(num);
        int left = 0;

        if (k >= size)
            return "0";

        for (int i=k; i<size; i++) {
            String n = prefix + num.substring(i);
            prefix.append(num.charAt(left++));
            minor = Math.min(minor, Integer.parseInt(n));
        }
        String n = num.substring(0, size-k);
        minor = Math.min(minor, Integer.parseInt(n));

        return Integer.toString(minor);
        
    }
}
