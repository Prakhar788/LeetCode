​![1](https://user-images.githubusercontent.com/102613412/191568988-30e7dd17-be0b-4080-bf85-46883ab2fc94.jpeg)
Adtiya Verma
class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int m=x.length();
        int n=y.length();
        int t[][]=new int [m+1][n+1];
        for(int i=0;i<m+1;i++)
        { 
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++)
        { 
            for(int j=1;j<n+1;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))
                {
                    t[i][j]=1+t[i-1][j-1];
                }
                else
                {
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
}
