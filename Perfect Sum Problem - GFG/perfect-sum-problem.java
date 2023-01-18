//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int N, int sum) 
	{ 
	     int dp[][]=new int[N+1][sum+1];
	     int mod=(int)1e9+7;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
                if(i>0 && j>=0){
                    if(arr[i-1]<=j){
                     dp[i][j] = (dp[i-1][j-arr[i-1]]+dp[i-1][j])%mod;
                 }
                 else{
                     dp[i][j] = (dp[i-1][j])%mod;
                 }
                }
            }
        }
         return (dp[N][sum])%mod;
	} 
}