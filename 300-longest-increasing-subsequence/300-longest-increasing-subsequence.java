// class Solution {
//     public int lengthOfLIS(int[] nums) {
//      if(nums.length==0){
//          return 0;
//      }
//         int[]dp=new int[nums.length];
//         dp[0]=1;
//         int ans=1;
//        for(int i=1;i<dp.length;i++){
//            int max=0;
//            for(int j=0;j<i;j++){
//                if(nums[i]>nums[j]){
//                    max=Math.max(max,dp[j]);
//                }
//            }
//            dp[i]=max+1;
//            ans=Math.max(ans,dp[i]);
//        }
//         return ans;
//     }
// }
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int ansSize = 0;
        for (int i: nums) {
            int start = 0, end = ansSize;
            while (start != end) {
                int mid = (start + end) / 2;
                if (i > ans[mid]) start = mid + 1;
                else end = mid;
            }
            ans[start] = i;
            if (start == ansSize) ansSize++;
        }
        return ansSize;
    }
}