/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> s = new Stack<>();
        s.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(!s.isEmpty() && s.peek() != nums[i]) 
                s.pop();
            else
               s.push(nums[i]);
        }
        return s.pop();
    }
}
// @lc code=end

