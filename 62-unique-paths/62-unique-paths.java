//dp[i][j]=dp[i][j-1]+dp[i-1][j]
//O(m*n)
//fill first row and coloum with 1s.because there are only one from first row and coloumn to move at the end of it.
class Solution {
    public int uniquePaths(int m, int n) {
        int [][]ar=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    ar[i][j]=1;
                }
                else{
                   ar[i][j]=ar[i][j-1]+ar[i-1][j] ;
                }
            }
        }return ar[m-1][n-1];
    }
}