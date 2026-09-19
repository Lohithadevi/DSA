class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            ArrayList<Integer> curr=new ArrayList<>();
            if(map.getOrDefault(nums[i],null)!=null)
            {
                curr=new ArrayList<>(map.get(nums[i]));
            }
            curr.add(i);
            map.put(nums[i],curr);
        }
        int res=0;
        
        for(int n : map.keySet())
            {
                ArrayList<Integer> temp=new ArrayList<>(map.get(n));
                if(temp.size()==3)
                {
                    int i=temp.get(0);
                    int j=temp.get(1);
                    int k=temp.get(2);

                    if(j-i == k-j)
                    {
                        res++;
                    }
                }
                
            }

        return res;
        
    }
}