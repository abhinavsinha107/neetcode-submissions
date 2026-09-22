class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            buy = prices[i] < buy ? prices[i] : buy;
            int currentProfit = prices[i] - buy;
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit;
    }
}
