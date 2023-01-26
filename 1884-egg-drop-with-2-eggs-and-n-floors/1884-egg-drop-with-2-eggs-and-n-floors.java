class Solution {

    // public int solveMem(int eggs,int floors,int[][]dp){
    //     if(eggs==0 || floors==0) return 0;
    //     if(eggs==1) return floors;
    //     if(floors==1) return 1;
    //     if(dp[eggs][floors]!=-1) return dp[eggs][floors];
    //     int ans = Integer.MAX_VALUE;
    //     for(int k=1;k<=floors;k++){
    //         ans = Math.min(ans,1+Math.max(solveMem(eggs-1,k-1,dp),solveMem(eggs,floors-k,dp)));
    //     }
    //     return dp[eggs][floors]=ans;
    // }
    public int twoEggDrop(int n) {
        int[][] dp = new int[3][n+1];

        for(int[] arr : dp) Arrays.fill(arr,-1);
        return solve(2,n,dp);
    }
    int solve(int e, int f,int[][]dp) {
        if(e == 1) return f;
        if(f == 0 || f == 1) return f;
        
        if(dp[e][f] != -1) return dp[e][f];
        int ans = Integer.MAX_VALUE;
       
        int left = 1, right = f;
        while(left <= right) {
            int k = left + (right - left) / 2;
            
            int low = solve(e-1, k-1,dp);
            int high = solve(e, f-k,dp);
            
            int temp = 1 + Math.max(low, high);
            ans = Math.min(ans, temp);
            if(low < high) left = k + 1;
            else right = k - 1;          
        }   
		
        return dp[e][f] = ans;
    }
}