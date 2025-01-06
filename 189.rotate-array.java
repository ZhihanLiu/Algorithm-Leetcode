/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        k= k%nums.length;
        reverse(nums, 0, nums.length);
    
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }

    public void reverse(int[] nums, int start, int k){
      int i = start;
      int j = k -1;
      while(i < j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] =temp;
        i++;
    
        j--;
      }

    }
}
// @lc code=end

