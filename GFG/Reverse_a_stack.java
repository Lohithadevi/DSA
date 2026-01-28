class Solution {
    public static void fun(Stack<Integer> st)
    {
        if(st.isEmpty()) return;
        int poped=st.pop();
        fun(st);
        Stack<Integer> help=new Stack<>();
        while(!st.isEmpty())
        {
            help.push(st.pop());
        }
        st.push(poped);
        while(!help.isEmpty())
        {
            st.push(help.pop());
        }
        return;
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        fun(st);
    }
}
