class Solution {
    public int pivotIndex(int[] nums) {
    int sum=0;int cursum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            int left=cursum-nums[i];
            int right=sum-cursum;
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}