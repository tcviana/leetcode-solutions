// https://leetcode.com/problems/valid-parentheses

class Solution {

    private static Map<Character, Character> pairCloseParentheses = Map.of(')','(',']','[','}','{');
    private Deque<Character> stack = new ArrayDeque<>();

    public boolean isValid(String s) {

        for (char c : s.toCharArray()) {
            if (openParentheses(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && validClose(c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean openParentheses(char c) {
        return !pairCloseParentheses.containsKey(c);
    }

    private boolean validClose(char c) {
        return stack.peek() == pairCloseParentheses.get(c);
    }
}
