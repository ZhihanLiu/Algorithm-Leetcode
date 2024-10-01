/*
 * @lc app=leetcode id=159 lang=java
 *
 * [159] Longest Substring with At Most Two Distinct Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0;
        int max = -1;
      
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> q = new PriorityQueue<>(
           (a, b) ->{
              return map.get(a) - map.get(b);
           }
        );


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
          if(map.keySet().size() == 2 && !map.containsKey(c)){
            char cur = q.poll();
            start = map.get(cur) +1;
            map.remove(cur);
          }
          map.put(c, i);
          q.remove(c);
          q.add(c);
      
           max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
// @lc code=end

