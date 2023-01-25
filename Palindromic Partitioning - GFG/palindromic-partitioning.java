//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    // cheaking palindrom func
    static boolean palid(String str,int i,int j){
        if(i>=j) return true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    // main func  
    static int palindromicPartition(String str){
    int dp[][]= new int[501][501];
    for(int i=0;i<501;i++){
        for(int j=0;j<501;j++)
        dp[i][j]=-1;
    }
    // Arrays.fill(dp,-1);
    return solve(str,0,str.length()-1,dp);
    }
    // func to solving 
    static int solve(String str,int i,int j,int dp[][]){
        if(i>=j) return 0; // base condition
        
        if(palid(str,i,j)) return 0; // if alredy palindrome then no need of cuts
        
        if(dp[i][j]!=-1) return dp[i][j]; // if alredy solved
        
        int left=0,right=0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            if(dp[i][k]!=-1){
                left=dp[i][k];
            }else{
                left=solve(str,i,k,dp);
                dp[i][k]=left;
            }
            if(dp[k+1][j]!=-1){
                right=dp[k+1][j];
            }else{
                right=solve(str,k+1,j,dp);
                dp[k+1][j]=right;
            }
            int temp=1+left+right;
            min=Math.min(min,temp);
        }
        return dp[i][j]=min;
    }
}
// class Solution{
//     static int dp[][]=new int[101][101];
//     static int palindromicPartition(String str)
//     {
//         // code here
//          for(int i=0;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         return solve(str,0,str.length()-1);
//     }
//     static int solve(String str,int i,int j){
//         int left=0,right=0;
//         int ans=Integer.MAX_VALUE;
//         if(i>=j){
//             return 0;
//         }
//          if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         if(isPalindromeString(str,i,j)==true){
//             return 0;
//         }
        
//         for(int k=i;k<=j-1;k++){
//             if(dp[i][k]!=-1){
//                 left=dp[i][k];
//             }
//             else{
//                 left=solve(str,i,k);
//                 dp[i][k]=left;
//             }
            
//             if(dp[k+1][j]!=-1){
//                 right=dp[k+1][j];
//             }
//             else{
//                 right=solve(str,k+1,j);
//                 dp[k+1][j]=right;
//             }
            
//             int temp=1+left+right;
//              if(temp<ans){
//                 ans=temp;
//             }
//         }
//         return dp[i][j]=ans;
        
//     }
//     static boolean isPalindromeString(String s,int i,int j) {
// 	while (i < j) {
// 			if (s.charAt(i) != s.charAt(j)) {
// 				return false;
// 			}

// 			i++;
// 			j--;
// 		}
// 		return true;

// 	}
// }