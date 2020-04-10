class MinStack {

    /** initialize your data structure here. */
    
    Stack<Integer> minStack; List<Integer> min;
    
    
    public MinStack() {
             minStack = new Stack<>();
            min= new ArrayList<>();
    }
    
    public void push(int x) {
        min.add(x);
        minStack.push(x);
        //System.out.println("pushed called");
        
    }
    
    public void pop() {
        min.remove(new Integer(minStack.peek()));
        minStack.pop();
    }
    
    public int top() {      
        return minStack.peek();
    }
    
    public int getMin() {      
        return Collections.min(min);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
