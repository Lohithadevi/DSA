class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
        {
            if(a[0]==b[0]) return a[1]-b[1];
            else
            {
                return a[0]-b[0];
            }
        });
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int st=intervals[0][0];
        int ed=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=st &&intervals[i][0]<=ed)
            {
                if(intervals[i][1]>=st &&intervals[i][1]<=ed) continue;
                ed=intervals[i][1];
            }
            else
            {
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(st);
                temp.add(ed);
                res.add(new ArrayList<>(temp));
                st=intervals[i][0];
                ed=intervals[i][1];
            }
        }
         ArrayList<Integer> temp=new ArrayList<>();
                temp.add(st);
                temp.add(ed);
        res.add(new ArrayList<>(temp));
        int mat[][]=new int[res.size()][2];
        for(int i=0;i<res.size();i++)
        {
            mat[i][0]=res.get(i).get(0);
            mat[i][1]=res.get(i).get(1);
        }
        return mat;

    }
}