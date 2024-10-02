/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while(left + 1 < right){
            int mid = left + (right - left )/2;
            if(nums[mid] > nums[mid -1] && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(nums[mid] > nums[mid -1]) left = mid;
            else right = mid;
        }
        return  nums[left]> nums[right]? left : right;

    }
}
// @lc code=end

