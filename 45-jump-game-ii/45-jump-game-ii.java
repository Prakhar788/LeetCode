// //Top-DownApproach
// class Solution {
//     public int jump(int[] nums) {
//      int n=nums.length;
//      int []dp=new int[n];
//      Arrays.fill(dp,Integer.MAX_VALUE);
   
//         dp[n-1]=0;
//         for(int i=n-2;i>=0;i--){
//             int min=Integer.MAX_VALUE;
//             for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
//                 min=Math.min(min,dp[j]);
//             }
//             if(min!=Integer.MAX_VALUE){
//                 dp[i]=min+1;
//             }
//         }
//         return dp[0];
//     }
// }


class Solution {
    public int jump(int[] nums) {        
        int i =0;
        int index = 0;
        while( index < nums.length -1){
            index = getNextIndex(index, nums);
            i++;
        }        
        return i;        
    }
    
    private int getNextIndex(int index, int[] nums){
        int maxSteps = nums[index];
        int max = -1001;
        int next = 0;
        if(index + maxSteps >= nums.length -1){
            return nums.length -1;
        }
        
        if(maxSteps == 1){
            return index +1;
        }

        for(int i = 1; i <= maxSteps; i++){
            if(nums[index + i] ==0){
                continue;
            }            
            
            if(nums[index + i] - (maxSteps -i) >= max){
                max = nums[index + i] - (maxSteps -i);
                next = i;
            }
            
        }
        
        return next+index;
    }
}