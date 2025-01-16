/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int low = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            max = Math.max(max, prices[i] - low);
            low = Math.min(low, prices[i]);
        }
        return max;
    }
    
}
// @lc code=end

