
class Solution {
    public void sort012(int[] arr) {
        // code here
        int f=0;
        int l=arr.length-1;
        int i=0;
        while(i<=l)
        {
        
            if(arr[i]==0)
            {
                arr[i]=arr[f];
                arr[f]=0;
                i++;
                f++;
            }
            else if(arr[i]==2)
            {
                arr[i]=arr[l];
                arr[l]=2;
                l--;
            }
            else
            {
                i++;
            }
        }
    }
}