class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(curr=='(')
            {
                st.push(-1);
            }
            else
            {
                int tot=0;
                while(!st.isEmpty())
                {
                    int pop=st.pop();
                    if(pop==-1) break;
                    tot+=pop;
                }
                if(tot==0)
                {
                    tot=1;
                }
                else
                {
                    tot=tot*2;
                }
                st.push(tot);
            }
        }
        int res=0;
        while(!st.isEmpty())
        {
            res+=st.pop();
        }
        return res;
    }
}