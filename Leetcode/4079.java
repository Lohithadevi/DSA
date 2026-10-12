class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<arr.length;i++)
        {
            for(int j=2;i*j<n+1;j++)
            {
                arr[j*i]=1;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1) continue;
            sum+=i;
            if(sum<=s)
            {
                list.add(i);
            }
            else break;
        }
        return list;
    }
}