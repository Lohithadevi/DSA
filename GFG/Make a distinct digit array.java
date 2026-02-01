

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        int arr[]=new int[10];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            
            int curr=nums[i];
            if(curr<10)
            {
                if(arr[curr]!=1)
                {
                    list.add(curr);
                    arr[curr]=1;
                }
                continue;
            }
            while(curr!=0)
            {
                if(arr[curr%10]!=1)
                {
                    arr[curr%10]=1;
                    list.add(curr%10);
                }
                curr=curr/10;
            }
        }
        Collections.sort(list);
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
        
    }
}