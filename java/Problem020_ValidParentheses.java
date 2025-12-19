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
class Solution2 {
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

// solution 3, java 8
class Solution3 {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if (isOpenBracket(c)) {
                char pair = closeBracket(c);
                stack.push(pair);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty() || stack.pop() != c) 
                    return false;
            }
        }
        
        return stack.isEmpty();
    }

    private boolean isCloseBracket(char c) {
        if (c==')' || c==']' || c=='}') 
            return true;
        else 
            return false;
    }

    private boolean isOpenBracket(char c) {
        if (c=='(' || c=='[' || c=='{') 
            return true;
        else 
            return false;
    }

    private char closeBracket(char c) {
        if (c == '(') return ')';
        if (c == '[') return ']';
        if (c == '{') return '}';
        return c;
    }
}

// solution 4, 2025-12-19
class Solution {
    private Map<Character,Character> brackets = Map.of('(',')','{','}','[',']');

    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stack.push(brackets.get(c));
            } else if (isClose(c)) {
                if (stack.isEmpty() || stack.pop() != c) 
                    return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpen(char c) {
        return brackets.containsKey(c);
    }

    private boolean isClose(char c) {
        return brackets.containsValue(c);

    }
}
