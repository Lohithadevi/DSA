class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        boolean arr[]=new boolean[nums.length];
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        fun(list,arr,nums,res);
        return res;
    }
    public static void fun(List<Integer> list,boolean arr[],int[] nums,List<List<Integer>> res)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]) continue;
            arr[i]=true;
            list.add(nums[i]);
            fun(list,arr,nums,res);
            list.remove(list.size()-1);
            arr[i]=false;
        }
    }
}