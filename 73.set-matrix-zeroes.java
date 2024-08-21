
import java.util.Arrays;

/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isFirstRow = false;
        boolean isFirstCol = false;
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i < row; i++) if(matrix[i][0] == 0) isFirstCol = true;
        for(int i = 0; i < col; i++) if(matrix[0][i] == 0) isFirstRow = true;

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }

        if(isFirstCol)
         for(int j = 0; j < row; j++)matrix[j][0] = 0;
        
        if(isFirstRow) Arrays.fill(matrix[0],0);
        
        

    }
}
// @lc code=end

