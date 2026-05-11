class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            int n=nums[i];
            while(n!=0)
            {
                int r=n%10;
                li.add(r);
                n/=10;
            }
        }
        
        int[] res=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            res[li.size()-i-1]=li.get(i);
        }
        return res;
    }
}