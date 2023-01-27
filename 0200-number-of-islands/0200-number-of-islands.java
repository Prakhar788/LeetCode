class Solution {
    public int numIslands(char[][] grid) {
    if(grid==null||grid.length==0||grid[0].length==0){
        return 0;
    }
    int m=grid.length;
    int n=grid[0].length;
    int noi=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    noi++;
                }
            }
        }
    return noi;
    }
    static void dfs(char[][]grid,int row,int col){
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]=='0'){
            return;
        }
         grid[row][col]='0';
        dfs(grid,row,col-1);
         dfs(grid,row-1,col);
         dfs(grid,row,col+1);
         dfs(grid,row+1,col);
    }
}