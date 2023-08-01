class Solution {
    public int maxProfit(int[] prices) {
    int min=prices[0];
    int max_profit=0;
    int profit=0;
    for(int i=0;i<prices.length;i++){
        profit=prices[i]-min;
        max_profit=Math.max(max_profit,profit);
        min=Math.min(min,prices[i]);
    }    
        return max_profit;
    }
}