/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int res = nums.length;
        for( int i = 0; i < nums.length - index; i++) {
            if(nums[i] == val) {
                index++;
                int j = nums.length -index;
                while (nums[j] == val && j > i) {
                    index++;
                    j--;
                }
                if(j == i) return nums.length - index;
                nums[i] =nums[j];
            }

        }
        return nums.length - index;
    }
}
// @lc code=end

