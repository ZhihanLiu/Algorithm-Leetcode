/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        HashSet<String> set = new HashSet<>();
        for(String word : wordDict) set.add(word);
        dp[0] = true;
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < i; j++){
            if(set.contains(s.substring(j, i)) && dp[j]){
              //  System.out.println(s.substring(j, i));
                dp[i] =true;
                break;
            }

           }
        }
        return dp[s.length()];
    }
}
// @lc code=end

