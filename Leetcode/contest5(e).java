class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int arr[]=new int[101];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            {
                if(arr[nums[i]]<k)
                {
                    list.add(nums[i]);
                    arr[nums[i]]++;
                }
                
            }
        int res[]=new int[list.size()];
        for(int i=0;i<res.length;i++)
            {
                res[i]=list.get(i);
            }
        return res;
        
    }
}