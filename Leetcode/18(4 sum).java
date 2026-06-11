class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
       List<List<Integer> > list=new ArrayList<>();
        if(target>=Integer.MAX_VALUE || target<=Integer.MIN_VALUE) return list;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            long f=nums[i];
           
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j-i>1 && nums[j]==nums[j-1])
                {
                continue;
                }
                long s=nums[j];
                int e=nums.length-1;
                for(int k=j+1;k<nums.length-1;k++)
                {
                    if(k-j>1 && nums[k]==nums[k-1])
                {
                    continue;
                }
                    if(e<=k) break;
                    long  curr=f+nums[e]+nums[k]+s;
                    if(curr==target)
                    {
                        
                        ArrayList<Integer> li=new ArrayList<>();
                        li.add((int)f);
                         li.add((int)s);
                          li.add((int)nums[k]);
                           li.add((int)nums[e]);
                        list.add(new ArrayList<>(li));
                        
                    }
                    else if(curr>target)
                    {
                        e--;
                        k--;
                    }
                }
            }
        }
        return list;
    }
}