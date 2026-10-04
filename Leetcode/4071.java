class Solution {
    public int minRotations(int n, String s) {
        int arr[]=new int[n+1];
        arr[0]=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            int n1=(int)(s.charAt(i)-'0');
            arr[i+1]=arr[i]+ans(c,n1);
            
            c=n1;
        }
        if(n==1 )
        {
            return arr[arr.length-1];
        }
        int j=arr.length-1;
        int res=Integer.MAX_VALUE;
        for(int k=0;k<arr.length-2;k++)
        {
            int num=0;
            int curr=0;
            if(k!=0)
            {
            curr=(int)(s.charAt(k-1)-'0');
            }
        
            int i=k+1;
            int m1=ans(curr,(int)(s.charAt(k)-'0'));
            int m2=ans(curr,(int)(s.charAt(s.length()-1))-'0');
            num+=arr[k];
            num+=Math.min(m1,m2);
            num+=(arr[arr.length-1]-arr[k+1]);
           
            res=Math.min(res,num);
            
        }
        return res;
        
    }
    public static int ans(int curr,int n)
    {
            int f1=curr+(9-n)+1;
            int f2=(9-curr)+n+1;
            int f3=Math.abs(curr-n);
            return (Math.min(f1,Math.min(f2,f3)));
    }
}