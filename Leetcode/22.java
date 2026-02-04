class Solution {
    public boolean para(StringBuilder sb)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<sb.length();i++)
        {
            char c=sb.charAt(i);
            if(c==')')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                st.pop();
            }
            else
            {
                st.push('(');
            }
        }
        return st.isEmpty();
    }
    public void fun(StringBuilder sb,int n1,int n2,ArrayList<String> list,int n,int i)
    {
    
        if(n1==n && n2==n)
        {
            if(para(sb))
            {
                list.add(""+sb);
            }
            return;
        }
        if(n1<n)
        {
        
            StringBuilder s1=new StringBuilder(sb);
            s1.append('(');
            fun(s1,n1+1,n2,list,n,i);
        }
        if(n2<n)
        {
            
             StringBuilder s2=new StringBuilder(sb);
             s2.append(')');
             fun(s2,n1,n2+1,list,n,i);
        }
       
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        fun(sb,0,0,list,n,0);
        return list;
    }
}