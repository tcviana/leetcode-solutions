// https://leetcode.com/problems/valid-parentheses

class Solution {

    Map<Character, Character> pairCloseParentheses = Map.of(')','(',']','[','}','{');
    List<Character> stack = new ArrayList<>();

    public boolean isValid(String s) {

        for (char c : s.toCharArray()) {
            if (openParentheses(c)) {
                stack.add(c);
                continue;
            } 
            if (validClose(c)) {
                stack.remove(stack.size()-1);
                continue;
            } 
            return false;
        }
        return stack.isEmpty();
    }

    private boolean openParentheses(char c) {
        return !pairCloseParentheses.containsKey(c);
    }

    private boolean validClose(char c) {
        int size = stack.size();

        if (size > 0) {
            return stack.get(size-1) == pairCloseParentheses.get(c);
        }
        return false;
    }
}
