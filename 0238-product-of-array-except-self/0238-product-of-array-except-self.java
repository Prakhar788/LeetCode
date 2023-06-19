class Solution {
    public int[] productExceptSelf(int[] nums) {
    int prod=1;
        int ans[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
      ans[i]=prod;
      prod*=nums[i];
    }
    
    prod=1;
    for(int i=nums.length-1;i>=0;i--){
        ans[i]*=prod;
        prod*=nums[i];
    }
        return ans;
    }
}