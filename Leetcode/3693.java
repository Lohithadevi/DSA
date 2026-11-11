class Solution {
    public int climbStairs(int n, int[] costs) {
         int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return fun(-1, n, costs,dp);
    }
    public static int fun(int i,int n,int[] costs,int[] dp)
    {
        
 if (i == n - 1) return 0;

        if (dp[i + 1] != -1) return dp[i + 1];

        int a1 = Integer.MAX_VALUE;
        int a2 = Integer.MAX_VALUE;
        int a3 = Integer.MAX_VALUE;

        if (i + 1 < n) {
            a1 = costs[i + 1] + 1 + fun(i + 1, n, costs,dp);
        }

        if (i + 2 < n) {
            a2 = costs[i + 2] + 4 + fun(i + 2, n, costs,dp);
        }

        if (i + 3 < n) {
            a3 = costs[i + 3] + 9 + fun(i + 3, n, costs,dp);
        }

        return dp[i + 1] = Math.min(a1, Math.min(a2, a3));

    }
}