class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n=nums.length;
     int []result=new int[n];
   int ans=1;
        for(int i=0;i<n;i++){
            result[i]=ans;
            ans=ans*nums[i];
        }
        
        ans=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*ans;
            ans=ans*nums[i];
        }
     
        return result;
    }
}