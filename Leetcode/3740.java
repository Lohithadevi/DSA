import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            ArrayList<Integer> li=new ArrayList<>();
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],li);
            }
            li=new ArrayList<>(map.get(nums[i]));
            li.add(i);
            map.put(nums[i],li);
          
        }
        int min=Integer.MAX_VALUE;
        boolean f=false;
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            if(arr[nums[i]]==1 || map.get(nums[i]).size()<3) continue;
            f=true;
            arr[nums[i]]=1;
            ArrayList<Integer> list=new ArrayList<>(map.get(nums[i]));
            for(int j=0;j<=list.size()-3;j++)
            {
                int v=2*(list.get(j+2)-list.get(j));
                min=min>v ? v : min;
            }
        }
        return f==true? min : -1;
    }
}