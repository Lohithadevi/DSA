class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        int sum=0;
        int l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            sum++;
            if(map.size()>2)
            {
                int g=map.get(fruits[l]);
                g--;
                sum--;
                if(g==0)
                {
                    map.remove(fruits[l]);
                }
                else
                {
                    map.put(fruits[l],g);
                }
                l++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}