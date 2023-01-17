//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends

//Memo
// class Solution 
// { 
//     //Function to return max value that can be put in knapsack of capacity W.
//     static int knapSack(int W, int wt[], int val[], int n) 
//     { 
//          // your code here 
//          for(int[] i:dp){
//              Arrays.fill(i,-1);
//          }
//         return   knap(W, wt, val, n);
        
             
         
//     } 
    
//     static int[][] dp = new int[1002][1002];
//     static int knap(int W, int wt[], int val[], int n){
//         if(n==0 || W==0) 
//         {
//             return 0;
//         }
//          if(dp[n][W]!=-1)return dp[n][W];
//          if(wt[n-1]<=W){ 
//              dp[n][W]=Math.max(val[n-1]+knap(W-wt[n-1],wt,val,n-1), knap(W, wt, val, n-1));
             
//          }
//          else {
//              dp[n][W]= knap(W, wt, val, n-1);
             
//          }
//             return dp[n][W];
//     }
// }
// Top Down Approach
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp = new int [n+1][W+1];
         
         for(int i=1; i<dp.length; i++){
             for(int j=1; j<dp[0].length; j++){
                 if(wt[i-1]<=j){
                     dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                 }
                 else{
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         
         return dp[n][W];
             
         
    } 
    
   
}


