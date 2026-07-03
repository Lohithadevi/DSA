class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int curr=0;
        for(int n : nums)
        {
            if(count==0){
                curr=n;
            }
            if(curr==n)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return curr;
    }
}









