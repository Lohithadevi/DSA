class Solution {
    public long maxAlternatingSum(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(Math.abs(nums[i]));
        }
        Collections.sort(list);
        int p1=0;
        int p2=list.size()-1;
        long l=0;
        while(p1<p2)
        {
            l+=(list.get(p2)*list.get(p2))-(list.get(p1)*list.get(p1));
            p1++;
            p2--;
        }
        if(p1==p2)
        {
            l+=list.get(p1)*list.get(p1);
        }
        return l;
    }
}