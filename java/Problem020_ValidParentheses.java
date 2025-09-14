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

// java 8
class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                char value = stack.isEmpty() ? '#' : stack.pop();
                if (map.get(c) != value) return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
        
    }
}
