class MinStack {

    Stack <Integer>  st;
    Stack <Integer> minst;

    int min ;

    public MinStack() {

        this.st = new Stack<Integer>();
        this.minst = new Stack<Integer>();
        this.min = Integer.MAX_VALUE;

        this.minst.push(this.min);
      
    }
    
    public void push(int val) {

        if(val < min || min == val){
            minst.push(min);
            min = val;
        }
        st.push(val);
        
    }
    
    public void pop() {

        if(st.peek() == min){
            min = minst.peek();
            minst.pop();
        }

        st.pop();
        
    }
    
    public int top() {

       return st.peek();
        
    }
    
    public int getMin() {
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