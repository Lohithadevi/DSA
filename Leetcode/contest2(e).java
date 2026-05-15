class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        if(nums.length==1)
        {
            li.add(nums[0]);
            return li;
        }
        
        int left[]=new int[nums.length];
        int g=nums[0];
        left[0]=g;
        for(int i=1;i<nums.length;i++)
            {
                g=nums[i]>g?nums[i]:g;
                left[i]=g;
            }
        int right[]=new int[nums.length];
        g=nums[nums.length-1];
        right[nums.length-1]=g;
        for(int i=nums.length-1;i>=0;i--)
            {
                g=nums[i]>g?nums[i]:g;
                right[i]=g;
            }
        li.add(nums[0]);
        for(int i=1;i<nums.length-1;i++)
            {
                if(nums[i]>left[i-1] || nums[i]>right[i+1])
                {
                    li.add(nums[i]);
                }                    
            }
        li.add(nums[nums.length-1]);
        return li;
    }
}©leetcode