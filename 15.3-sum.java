/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
             if(i > 0 && nums[i] == nums [i - 1]) continue;
             twoSum(nums, i + 1, nums.length - 1, i);
        }
        return ans;
    }
    public void twoSum(int[] nums, int x, int y, int target){
         while(x < y){
            if(nums[x] + nums[y] + nums[target] == 0){
                List<Integer> cur = new ArrayList<>();
                cur.add(nums[target]);
                cur.add(nums[x]);
                cur.add(nums[y]);
                ans.add(new ArrayList<Integer>(cur));
                x++; 
                y--;
                while(x < y && nums[x] == nums[x - 1]) x++;
                while(x < y && nums[y] == nums[y + 1]) y--;
            }
            else if(nums[x] + nums[y] + nums[target] < 0) {
                     x++;
            }
            else 
               y--;
         }
    }


    public void main(String[] args){
        int [] nums = {1,-1,-1,0};
        threeSum(nums);
    }
}
// @lc code=end

