/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n -1;
        for( int i = m-1, j = n-1; i>=0 ||j >=0; ) {
            int left = i >=0? nums1[i]:Integer.MIN_VALUE;
            int right = j >=0? nums2[j]:Integer.MIN_VALUE;
            
            if(left > right){
                nums1[index--] =left;
                i--;
           }
            else{
                nums1[index--] =right;
                j--;
           }
        }
    }
}
// @lc code=end

