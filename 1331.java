class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int narr[]=Arrays.copyOf(arr,arr.length);
       HashMap<Integer,Integer> map=new HashMap<>();
       Arrays.sort(narr);
       int idx=1;
       for(int i=0;i<arr.length;i++)
       {
        if(map.getOrDefault(narr[i],0)==0)
        {
            map.put(narr[i],idx);
            idx++;
        }
       }
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}