class Solution {
    public List<String> generateParenthesis(int n) {
       
        ArrayList<String> res=new ArrayList<>();
         if(n==0) return res;
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        fun(sb,res,st,n,0);
        return res;
    }
    public static void fun (StringBuilder sb, ArrayList<String> res , Stack<Character> st,int n, int curr)
    {
        if(curr==n*2)
        {
            if(st.isEmpty())
            {
                res.add(sb.toString());
                
            }
            return;
        }
        sb.append('(');
        st.push('(');
        fun(sb,res,st,n,curr+1);
        sb.deleteCharAt(sb.length()-1);
        
        st.pop();
        if(!st.isEmpty())
        {
            char c=st.peek();
            if(c=='(')
            {
                sb.append(')');
                st.pop();
                fun(sb,res,st,n,curr+1);
                sb.deleteCharAt(sb.length()-1);
                st.push('(');
            }
        }
        return;
    }
}