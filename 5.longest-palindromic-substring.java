/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int row = s.length();
        boolean [][]dp = new boolean[row][row];
        int max = 0;
        String ans =s.substring(0,1);
        for(int i = row -1; i>=0; i --){
            dp[i][i] = true;
            for(int j = i +1; j < row; j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && (i+1 < j &&dp[i+1][j-1] || i+1 ==j);
                 if(dp[i][j] && j - i + 1 > max){
                    max = j - i + 1;
                    ans = s.substring(i, j+1);
                 }
            }
        }
        return ans;
    }
}
// @lc code=end

