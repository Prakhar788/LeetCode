class Solution {
    int sum=0;
    public boolean canPartition(int[] nums) {
     int n=nums.length;
     
    for(int i=0;i<n;i++){
       sum+=nums[i]; 
    }
        if(sum%2!=0){
            return false;
        }
        else if(sum%2==0){
            return isSubsetSum(n,nums,sum/2);
        }
        return false;
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean dp[][]=new boolean[N+1][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
         for(int i=1; i<dp.length; i++){
             for(int j=1; j<dp[0].length; j++){
                 if(arr[i-1]<=j){
                     dp[i][j] = dp[i-1][j-arr[i-1]]||dp[i-1][j];
                 }
                 else{
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         return dp[N][sum];
    }
}