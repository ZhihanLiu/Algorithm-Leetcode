/*
 * @lc app=leetcode id=246 lang=java
 *
 * [246] Strobogrammatic Number
 */

// @lc code=start
class Solution {
    public boolean isStrobogrammatic(String num) {
        int start = 0;
        int end = num.length() -1;
        while(start < end){
          if(!isValid(num.charAt(start), num.charAt(end))) return false;
          start++;
          end--;
        }
        if(start == end) return isValid(num.charAt(start),num.charAt(start));
        return true;
      }
      public boolean isValid(char a , char b){
          return (a == '6' && b == '9') || (a == '0' && b == '0')
          || (a == '1' && b == '1')
          || (a == '8' && b == '8')
          || (a == '9' && b == '6');
      }
}
// @lc code=end

