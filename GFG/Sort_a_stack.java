class Solution {
    public void fun(Stack<Integer> st)
    {
        if(st.isEmpty()) return;
        int poped=st.pop();
        fun(st);
        if(st.isEmpty())
        {
            st.push(poped);
            return;
        }
        Stack<Integer> help=new Stack<>();
        while(!st.isEmpty())
        {
            if(st.peek()<=poped)
            {
                break;
            }
            help.push(st.pop());
        }
        st.push(poped);
        while(!help.isEmpty())
        {
            st.push(help.pop());
        }
        return;
    }
    public void sortStack(Stack<Integer> st) {
        // code here
       fun(st);
        
    }
}