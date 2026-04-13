
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] minFromLeft = new int[n];
        int[] maxFromRight = new int[n];

   
        minFromLeft[0] = prices[0];
        for (int i = 1; i < n; i++) {
            minFromLeft[i] = Math.min(minFromLeft[i - 1], prices[i]);
        }

        maxFromRight[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxFromRight[i] = Math.max(maxFromRight[i + 1], prices[i]);
        }

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxFromRight[i] - minFromLeft[i]);
        }

        return maxProfit;
    }
}