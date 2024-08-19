/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
        for(int i = 0; i < numRows; i++) list.add(new ArrayList<Character>());

        boolean isDown = false;
        int index = 0;
        for(char c : s.toCharArray()){
            list.get(index).add(c);
            if(index == numRows - 1 || index == 0) isDown = !isDown;
            if(isDown) index++;
            else index --;
        }

        StringBuilder sb = new StringBuilder();
        for(ArrayList<Character> l : list)
            for(char c : l)
             sb.append(c);

        return sb.toString();
        
    }
}
// @lc code=end

