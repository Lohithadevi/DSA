class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list=new ArrayList<>();
        int s=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
            {
                c++;
            }
            else if(nums[i]>pivot)
            {
                list.add(nums[i]);
            }
            else
            {
                nums[s]=nums[i];
                s++;
            }
        }
        int sum=list.size()+c;
        sum=nums.length-sum;
        for(int i=sum;i<nums.length-list.size();i++)
        {
            nums[i]=pivot;
            sum++;
        }
        int idx=0;
        for(int i=sum;i<nums.length;i++)
        {
            nums[i]=list.get(idx);
            idx++;
        }
        return nums;
    }
}