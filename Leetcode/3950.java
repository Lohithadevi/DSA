class Solution {
    public boolean consecutiveSetBits(int n) {
        
        StringBuilder sb=new StringBuilder();
        while(n!=0)
        {
            int r=n%2;
            sb.append(r);
            n=n/2;
            
        }
        sb.reverse();
        int f=0;
        for(int i=0;i<sb.length()-1;i++)
        {
            if(sb.charAt(i)=='1' && sb.charAt(i+1)=='1')
            {
                f++;
            }
        }
        return f==1;
       
    }
}