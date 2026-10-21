class Solution {
    public String maxSumOfSquares(int num, int sum) {
       StringBuilder sb=new StringBuilder();
       for(int i=9;i>=1;i--)
       {
        int q=0;
        if(i<=sum)
        {
             q=sum/i;
            sum=sum%i;
            
        }
        for(int j=0;j<q;j++)
        {
            sb.append(""+i);
        }
        if(sum==0) break;
       }
       if(sb.length() <= num)
       {
        int n=sb.length();
        for(int i=n;i<num;i++)
        {
            sb.append("0");
        }
       }
       else return "";

return sb.toString();
    }
   
}