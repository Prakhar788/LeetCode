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
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n)  { 
	   
	   int sum=0, diff=Integer.MAX_VALUE;
	   for(int i=0;i<n;i++)
	   {
	       sum+=arr[i];
	   }
	   boolean t[][]=new boolean [n+1][sum+1];
	   for(int i=0;i<n+1;i++)
	   {
	       for(int j=0;j<sum+1;j++)
	       {
	           if(i==0)
	           t[i][j]=false;
	           if(j==0)
	           t[i][j]=true;
	       }
	   }
	   for(int i=1;i<n+1;i++)
	   {
	       for(int j=1;j<sum+1;j++)
	       {
	           if(arr[i-1]<=j)
	           t[i][j]=(t[i-1][j-arr[i-1]]) || (t[i-1][j]);
	           else
	           t[i][j]=t[i-1][j];
	       }
	   }
	   for(int i=sum/2;i>=0;i--)
	   {
	       if(t[n][i]==true)
	       {
	           diff=Math.min(diff,sum-2*i);
	          
	       }
	   }
	   return diff;
	   
	}
}
