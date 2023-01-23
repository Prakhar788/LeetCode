//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
//length of lps is inveersly prop. to no. of deletions
class Solution 
{ 
    int minDeletions(String s, int n)
    {
        // code here
             StringBuffer sb=new StringBuffer(s);
        return s.length()-lcs(s,sb.reverse().toString());
    }
     public static int lcs(String x, String y) {
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

