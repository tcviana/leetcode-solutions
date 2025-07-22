// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxRepeat = 0;
        Set<Character> value = new HashSet<Character>();
        int size = s.length();

        for (int right=0, left=0; right<size; right++) {
            char newValue = s.charAt(right);
            while (value.contains(newValue)) {
                value.remove(s.charAt(left++));
            }
            value.add(newValue);
            maxRepeat = Math.max(maxRepeat, right - left +1);
        }

        return maxRepeat;
        
    }
}
