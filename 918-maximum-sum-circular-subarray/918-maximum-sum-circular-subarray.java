class Solution {
     public int kadane(int[] arr) {
        int sum=0,max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==0) return 0;
        int sum=0;
        int ans=kadane(nums);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]*=-1;
        }
        int ans2=kadane(nums);
        if(sum+ans2==0)return ans;
        return Math.max(sum+ans2,ans);
    }
}