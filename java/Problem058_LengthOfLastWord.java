// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int size = words.length;
        String word = words[size-1];

        return word.length();
    }
}
