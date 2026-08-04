class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            {
                if(Math.abs(nums[i]-nums[i+1])!=1){
                    for(int j=nums[i]+1;j<nums[i+1];j++)
                        {
                            li.add(j);
                        }
                }
                    
            }
        return li;
    }
}