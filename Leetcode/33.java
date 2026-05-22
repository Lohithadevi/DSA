class Solution {
    public int search(int[] nums, int target) {
        
        int s=0;
        int e=nums.length-1;
        if(nums[s]<=nums[e])
        {
            return check(nums,target,s,e);
        }
        while(true)
        {
            int m=(s+e)/2;
            if(s==m) break;
            if(nums[s]<=nums[m])
            {
                s=m;
            }
            else
            {
                e=m;
            }
        }
        int n1=check(nums,target,0,s);
        int n2= check(nums,target,s+1,nums.length-1);
        if(n1!=-1) return n1;
        if(n2!=-1) return n2;
        return -1;
    }
    public static int check(int nums[],int target,int s,int e)
    {
        
        if(s>=0 && e<=nums.length)
        {
            while(s<=e)
            {
                int m=s+e;
                m/=2;
                if(nums[m]==target) return m;
                if(nums[m]<target)
                {
                    s=m+1;
                }
                else
                {
                    e=m-1;
                }
            }
        }
        return -1;
    }
    }