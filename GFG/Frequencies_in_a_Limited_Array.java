class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[arr[i]-1]++;
        }
        for(int i=0;i<res.length;i++)
        {
            list.add(res[i]);
        }
        return list;
    }
}
