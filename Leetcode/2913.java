class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            int arr[]=new int[101];
            int tot=0;
            for(int j=i;j<nums.size();j++)
            {
                int curr=nums.get(j);
                if(arr[curr]==0)
                {
                    tot++;
                    arr[curr]=1;
                }
                 ans+=(tot*tot);
                
            }
            
           
        }
    return ans;
    }
}