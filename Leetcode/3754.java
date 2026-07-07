class Solution {
    public long sumAndMultiply(int x) {
        
        String str=""+x;
        long sum=0;
        long res=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!='0')
            {
               int n=Integer.parseInt(""+ch);
               sum+=n;
                res*=10;
                res+=n;
            }
        }
        return res*sum;
    }
}