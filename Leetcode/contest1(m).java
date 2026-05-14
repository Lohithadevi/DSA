class Solution {
    public int sumOfPrimesInRange(int n) {
        int n1=n;
        int n2=0;
        while(n!=0)
            {
                n2=(n2*10)+n%10;
                n/=10;
            }
        int t=n1;
        n1=Math.min(t,n2);
        n2=Math.max(t,n2);
        
        if(n2<2) return 0;
        int arr[]=new int[n2+1];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=4;i<arr.length;i++)
            {
                if(i%2==0 || i%3==0)
                {
                    arr[i]=-1;
                }
            }
        for(int i=5;i<arr.length/2;i++)
            {
                if(arr[i]==0)
                {
                    finish(i,arr,n2);
                }
            }
        int sum=0;
        for(int i=n1;i<=n2;i++)
            {
                if(arr[i]!=-1)
                {
                    sum+=i;
                }
            }
        return sum;
    }
    public static void finish(int i,int arr[],int n2)
    {
        int help=2;
        while(true)
            {
                int v=help*i;
                if(v>n2)break;
                arr[v]=-1;
                help++;
            }
    }
}©leetcode