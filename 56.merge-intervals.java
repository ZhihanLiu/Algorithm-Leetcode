/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.io.Console;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->{
            if(a[0]  == b [0])
               return a[1]- b[1];
            return a[0] - b[0];
        });

        List<int[]> ans = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){
            int j = i+1;
            while(j < intervals.length && intervals[j][0] <= intervals[i][1]){
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                j++;
            }
            ans.add(intervals[i]);
            if(j < intervals.length && intervals[j][0] > intervals[i][1]) i = j - 1;
            if(j >= intervals.length) break;
            
            System.out.println(i);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
// @lc code=end

