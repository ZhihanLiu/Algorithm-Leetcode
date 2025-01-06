/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[j - 1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
// @lc code=end

