// https://leetcode.com/problems/reverse-words-in-a-string

class Solution {
    fun reverseWords(s: String): String {
        val text = s.trim().split(Regex("\\s+"))

        val reversed = text.reversed()

        return reversed.joinToString(" ")
    }
}
