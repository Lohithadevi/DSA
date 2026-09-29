class Solution {
    public String evaluate(String s, List<List<String>> k) {
        HashMap<String, String> map=new HashMap<>();
        for(int i=0;i<k.size();i++)
        {
            map.put(k.get(i).get(0),k.get(i).get(1));
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=')')
            {
                st.push(ch);
                continue;
            }
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty())
            {
                char curr=st.pop();
                if(curr=='(')
                {
                    String key=sb.reverse().toString();

                    String val=map.get(key);
                    if(val==null)
                    {
                        st.push('?');
                        break;
                    }
                    for(int j=0;j<val.length();j++)
                    {
                        st.push(val.charAt(j));
                    }
                    break;
                }
                sb.append(curr);
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch : st)
        {
            str.append(ch);
        }
        return str.toString();
    }
}