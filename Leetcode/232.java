class MyQueue {
    Stack<Integer> st=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
       
        return;
    }
    
    public int pop() {
        Stack<Integer> t=new Stack<>();
        while(!st.isEmpty())
        {
            t.push(st.pop());
        }
        if(t.isEmpty()) return -1;
        int r =t.pop();
        while(!t.isEmpty())
        {
            st.push(t.pop());
        }
        return r;
    }
    
    public int peek() {
        Stack<Integer> t=new Stack<>();
        while(!st.isEmpty())
        {
            t.push(st.pop());
        }
        int r =t.peek();
        while(!t.isEmpty())
        {
            st.push(t.pop());
        }
        return r;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */