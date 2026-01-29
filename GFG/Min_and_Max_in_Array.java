class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> res=new ArrayList<>();
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(small > arr[i])
            {
                small=arr[i];
            }
            if(large < arr[i])
            {
                large=arr[i];
            }
           
        }
        res.add(small);
        res.add(large);
        return res;
    }
}
