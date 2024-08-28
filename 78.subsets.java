/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         helper(nums, new ArrayList<Integer>(), 0);
         return ans;
    }
    public void helper(int[] nums, ArrayList<Integer> cur, int index){
         ans.add(new ArrayList<Integer>(cur));
        for(int i = index; i < nums.length; i++){
            cur.add(nums[i]);
            helper(nums, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
// @lc code=end

