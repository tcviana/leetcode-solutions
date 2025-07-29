// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        // valid size
        if (s.length() != t.length()) 
            return false;

        // create array with 26 letters - a-z
        int[] letters = new int[26];

        // subtract a becouse array start in zero
        for (char c : s.toCharArray()) {
            letters[c - 'a'] += 1;
        }

        for (char c : t.toCharArray()) {
            letters[c - 'a'] -= 1;
        }

        // valid any letter not found
        for (int c : letters) {
            if (c > 0) {
                return false;
            }
        }

        return true;
    }
}
