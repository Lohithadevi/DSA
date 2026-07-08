class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
       int c=sort(0,arr.length-1,arr);
       return c;
    }
    public static int sort(int l, int h,int[] arr)
    {
        int c=0;
        if(l>=h) return 0;
        int m=(l+h)/2;
        c+=sort(l,m,arr);
        c+=sort(m+1,h,arr);
        c+=merge(l,h,m,arr);
        return c;
    }
    public static int merge(int l,int h,int m,int[] arr)
    {
        int c=0;
     int temp[]=new int[h-l+1];
     int idx=0;
     int p1=l;
     int p2=m+1;
     while(p1<=m && p2<=h)
     {
         if(arr[p1]<=arr[p2])
         {
             temp[idx]=arr[p1];
             p1++;
         }
         else
         {
             c+=m-p1+1;
             temp[idx]=arr[p2];
             p2++;
         }
         idx++;
     }
     while(p1<=m)
     {
         temp[idx]=arr[p1];
             p1++;
             idx++;
     }
     while(p2<=h)
     {
         temp[idx]=arr[p2];
             p2++;
             idx++;
     }
     idx=l;
     for(int i=0;i<temp.length;i++)
     {
         arr[idx]=temp[i];
         idx++;
     }
     return c;
    }
}