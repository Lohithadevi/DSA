class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==goal.charAt(0))
            {
                StringBuilder sb=new StringBuilder();
                sb.append(s.substring(i,s.length()));
                sb.append(s.substring(0,i));
                if(sb.toString().equals(goal)) return true;
            }
        }
        return false;
    }
}