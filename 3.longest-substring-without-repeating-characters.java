/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1) return 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int index = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && index <= map.get(c)){
                index = map.get(c)+ 1;
            }
            map.put(c, i);
            max = Math.max(i - index +1, max);
        }
        return max;
    }
}
// @lc code=end

