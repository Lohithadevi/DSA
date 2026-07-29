class Solution {
    int floorSqrt(int n) {
        // code here
     int l=1;
     int h=n;
     int res=-1;
     while(l<=h)
     {
         int m=(l+h)/2;
         int v=m*m;
         if(v==n)
         {
             return m;
         }
         else if(v<n)
         {
             res=m;
             l=m+1;
         }
         else
         {
             h=m-1;
         }
     }
     return res;
    }
}