/*
 * @lc app=leetcode id=163 lang=java
 *
 * [163] Missing Ranges
 */

// @lc code=start
class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 1){
            List<Integer> cur = new ArrayList<>();
             cur.add(lower);
            cur.add( upper);
            
            ans.add(new ArrayList<Integer>(cur));
            return ans;

        }
         Stack<Integer> stack = new Stack<Integer>();
        for(int i : nums){
            if(i >= lower && i <= upper){
                int left = stack.isEmpty()? lower: stack.peek() + 1;
                if(left == i){
                    stack.push (i);
                    continue;
                }
                List<Integer> cur = new ArrayList<>();
                cur.add(left);
                cur.add( i - 1);
                stack.push (i);
                ans.add(new ArrayList<Integer>(cur));
            }
        }
        if( stack.peek() < upper){
            List<Integer> cur = new ArrayList<>();
             cur.add(stack.peek() + 1);
            cur.add( upper);
           
            ans.add(new ArrayList<Integer>(cur));
        }
       
     
        return ans;
     
    }
}
// @lc code=end

