class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='#')
            {
                sb.append(sb);
            }
            else if(ch=='%')
            {
                sb.reverse();
            }
            else if(ch=='*')
            {
                
                String str=sb.toString();
               
                if(str.length()>0)
                {
                    str=str.substring(0,str.length()-1);
                sb=new StringBuilder();
                sb.append(str);
                }
                
                continue;
            }
            else
            {
                
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}