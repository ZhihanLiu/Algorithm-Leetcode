/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            int j = i + 1;
            while(j < nums.length && nums[j] == nums[j-1] + 1) j++;
            j--;
            if( j > i)
                 sb.append("->" + nums[j]);
            i = j+1;
            ans.add(sb.toString());
        }
        return ans;
    }
}
// @lc code=end

