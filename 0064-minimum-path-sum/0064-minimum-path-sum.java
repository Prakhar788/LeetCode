//dp[i][j]=grid[i][j]+min(dp[i-1][j],dp[i][j-1])
class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 ||grid[0].length==0){
            return 0;
        }
        
        int rows=grid.length;
        int col=grid[0].length;
        int [][]dp=new int[rows][col];
        dp[0][0]=grid[0][0];
        for(int i=1;i<rows;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int j=1;j<col;j++){
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<col;j++){
             dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[rows-1][col-1];
    }
}