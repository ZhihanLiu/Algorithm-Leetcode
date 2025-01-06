/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if( nums.length < 2 ) return nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        int i = 1;
        for(int j = 1; j < nums.length; j++){
            if(!map.containsKey(nums[j])||map.containsKey(nums[j]) && map.get(nums[j]) < 2){
                nums[i] = nums[j];
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                i++;
            }
        }
        return i;


    }
}
// @lc code=end

