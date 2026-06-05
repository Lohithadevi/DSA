class Solution {
    public int totalWaviness(int num1, int num2) {
        int res=0;
        for(int i=num1;i<=num2;i++)
        {
            String str=""+i;
            if(str.length()<3) continue;
            for(int j=1;j<str.length()-1;j++)
            {
                int n1=str.charAt(j-1)-'0';
                int curr=str.charAt(j)-'0';
                int n2=str.charAt(j+1)-'0';
                if(curr>n1 && curr>n2)
                {
                    res++;
                }
                else if(curr<n2 && curr<n1)
                {
                    res++;
                }
            }
        }
        return res;
    }
}