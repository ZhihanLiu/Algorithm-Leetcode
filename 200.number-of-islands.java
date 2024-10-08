/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i ,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][]grid, int x, int y){
        int [][]dir = {
            {0 , 1},
            {0 , -1},
            {1 , 0},
            {-1 , 0}
        };
        grid[x][y] = 'x';

        for(int[] d : dir){
           int newX = d[0] + x;
           int newY = d[1]+ y;
           if( newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == '1'){
            dfs(grid, newX, newY);
           }
        }

    }
}
// @lc code=end

