class Solution {
    public int totalNumbers(int[] digits) {
       
        int hold[]=new int[10];
        for(int i=0;i<digits.length;i++)
        {
            hold[digits[i]]++;
        }
        int res=0;
        int l;
        int m;
        int f;
        for(int i=100 ;i<=999;i++)
        {
            if(i%2!=0) continue;
            int curr=i;
            int arr[]=new int[10];
            l=curr%10;
            curr/=10;
            m=curr%10;
            curr/=10;
            f=curr%10;
            
            arr[l]++;
            arr[m]++;
            arr[f]++;
            if(arr[l]<=hold[l] && (arr[m]<=hold[m] && arr[f]<=hold[f]))
            {
                res++;
            }
        }
        return res;

    }
}