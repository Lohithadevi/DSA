class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=nums.length-4;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<=nums.length-3;j++)
            {
                if(j>1 && nums[j]==nums[j-1]) continue;
                int l=j+1;
                int r=nums.length-1;
                while(l<r)
                {
                    Long sum=(long)nums[i]+nums[j]+nums[r]+nums[l];
                    List<Integer> list=new ArrayList<>();
                    if(sum<target)
                    {
                        l++;
                    }
                    else if(sum>target)
                    {
                        r--;
                    }
                    else
                    {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        ans.add(list);
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1])
                        {
                            l++;
                        }
                        while(l<r && nums[r]==nums[r+1])
                        {
                            r--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}