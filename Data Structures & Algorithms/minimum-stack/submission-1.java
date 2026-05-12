class MinStack {
    Stack<Integer> s;

    public MinStack() {
       
        s = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();
        int mini = s.peek();

        while (!s.isEmpty()) {
            mini = Math.min(mini, s.peek());
            tmp.push(s.pop());
        }

        while (!tmp.isEmpty()) {
            s.push(tmp.pop());
        }

        return mini;
    }
}
