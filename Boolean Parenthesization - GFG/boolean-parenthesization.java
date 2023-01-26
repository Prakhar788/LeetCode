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
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int countWays(int n, String S){

        // code here

        int i=0,j=n-1;

        int t[][][]=new int[n+1][n+1][2];

        for(int k=0;k<n+1;k++){

            for(int f=0;f<n+1;f++){

                for(int g=0;g<2;g++){

                    t[k][f][g]=-1;

                }

            

        }}

        return Solve(S,i,j,1,t);

    }

    public static int Solve(String str,int i,int j,int isTrue,int t[][][]){

        int mod=1003;

        if(i>j){

            return 0;

        }

        if(i==j){

            if(isTrue==1){

             if(str.charAt(i)=='T'){

                 return 1;

             }

             else{

                 return 0;

             }

            }

            else{

             if(str.charAt(i)=='F'){

              return 1;   

             }

             else{

                 return 0;

             }

            }

        }

        if(t[i][j][isTrue]!=-1){

            return t[i][j][isTrue];

        }

        long ans=0;

        for(int k=i+1;k<j;k+=2){

            int lt=Solve(str,i,k-1,1,t);

            int lf=Solve(str,i,k-1,0,t);

            int rt=Solve(str,k+1,j,1,t);

            int rf=Solve(str,k+1,j,0,t);

            if(str.charAt(k)=='&'){

                if(isTrue==1){

                ans+=lt*rt;       

                }

                else{

                    ans+=(lf*rf)+(lf*rt)+(lt*rf);

                }

            }

            else if(str.charAt(k)=='|'){

                if(isTrue==1){

                    ans+=(lt*rt)+(rt*lf)+(lt*rf);

                }

                else{

                    ans+=(lf*rf);

                }

            }

            else if(str.charAt(k)=='^'){

                if(isTrue==1){

                    ans+=(lt*rf)+(lf*rt);

                }

                else{

                    ans+=(lf*rf)+(lt*rt);

                }

            }

        }

        return t[i][j][isTrue]=(int)(ans%mod);

    }

}

 

