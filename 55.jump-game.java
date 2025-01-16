/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        boolean [] visited = new boolean[nums.length];
        visited[0] = true;

        for(int i = 1; i < nums.length; i++){
            for(int j = i -1; j>=0; j--){
                visited[i] = visited[j] && (j + nums[j] >=i);
                if(visited[i]) break;

            }
        }
        return visited[nums.length- 1];

    }
}
// @lc code=end

