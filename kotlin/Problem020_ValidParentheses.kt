// https://leetcode.com/problems/valid-parentheses/

class Solution {
    private val parentheses = mapOf('(' to ')', '[' to ']', '{' to '}')


    fun isValid(s: String): Boolean {

        val stack = ArrayDeque<Char>()

        for (c in s) {
            if (c in parentheses.keys) {
                stack.add(c)
            } else {
                val last = stack.removeLastOrNull() ?: return false
                if (parentheses[last] != c) return false
            }
        }

        return stack.isEmpty()
        
    }
}
