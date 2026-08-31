class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int arr[]=new int[101];
        int c=nums.length+1;
        int s=1;
        for(int i=1;i<=nums.length;i++)
        {
            
            if(nums[i-1]%k!=0 || arr[nums[i-1]]!=0)
            {
                c--;
                continue;
            }

            if(nums[i-1]!=(s*k)) 
            {
                System.out.print(i+" "+nums[i-1]);
                return (s*k);
            }

        
            s++;
            arr[nums[i-1]]=1;
        }
        return k*c;
    }
}