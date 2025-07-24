// https://leetcode.com/problems/min-stack/

class MinStack {

    private Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if (!stack.isEmpty())
            stack.pop();
    }
    
    public int top() {
        if (stack.isEmpty())
            return 0;
        return stack.peek();
    }
    
    public int getMin() {
        if (stack.isEmpty())
            return 0;

        int min = Integer.MAX_VALUE;

        for (int num : stack) {
            if (min > num) {
                min = num;
            }
        }

        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
