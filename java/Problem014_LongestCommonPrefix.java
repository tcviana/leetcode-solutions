// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String result = strs[0];

        for (int i=1; i<strs.length; i++) {
            String word = strs[i];
            int j=0;
            int min = Math.min(word.length(), result.length());
            while (j < min && word.charAt(j)==result.charAt(j)) {
                j++;
            }
            result = result.substring(0,j);
        }

        return result;
        
    }
}
