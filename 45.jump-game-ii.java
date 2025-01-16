
import java.util.Arrays;

/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int [] visited = new int[nums.length];
        Arrays.fill(visited, -1);
        visited[0] = 0;

        for(int i = 1; i < nums.length; i++){
            for(int j = i -1; j>=0; j--){
                if(j + nums[j] >=i && visited[j] >= 0){
                    if( visited[i] < 0)
                      visited[i] = visited[j] + 1;
                    else
                    visited[i] = Math.min(visited[j] + 1, visited[i]);
                  
                }
               

            }
        }
        return visited[nums.length - 1]; 
    }
}
// @lc code=end

