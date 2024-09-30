/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max= 0;

        for(int i : nums) set.add(i);

        for(int i :set){
            if(!set.contains(i - 1)){
                int cur = 0;
                while(set.contains(i)){
                    //set.remove(i);
                  cur++;
                  i++;
                  
                }
                max = Math.max(max, cur);
               
            }
        }
        return max;

        
    }
}
// @lc code=end

