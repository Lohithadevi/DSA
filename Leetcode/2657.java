class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int a1[]=new int[A.length+1];
       int a2[] =new int[A.length+1];
       int track[]=new int[A.length+1];
       int p=0;
       int res[]=new int[A.length];
       for(int i=1;i<A.length+1;i++)
       {
        int c=0;
        int n1=A[i-1];
        int n2=B[i-1];
        if(a2[n1]==1 && track[n1]==0)
        {
            c++;
            track[n1]=1;
        }
        if(a1[n2]==1 && track[n2]==0)
        {
            c++;
            track[n2]=1;
        }
        if(n1==n2)
        {
            track[n1]=1;
            c++;
        }
        a1[n1]=a1[n1]==0?1:0;
        a2[n2]=a2[n2]==0?1:0;
        res[i-1]=p+c;
        p=res[i-1];
       }
       return res;
    }
}