// https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;

        int sizeText = t.length();
        int sizeLetter = s.length();

        int i=0,j=0;

        while (i < sizeLetter && j < sizeText) {
            if (t.charAt(j) == s.charAt(i))
                i++;
            j++;
        }

        return i==sizeLetter;
    }
}
