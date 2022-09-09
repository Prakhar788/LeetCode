class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n=nums.length;
     int []left=new int[n];
     int []right=new int[n];
     
     int ans=1;
        for(int i=0;i<n;i++){
            left[i]=ans;
            ans=ans*nums[i];
        }
        
        ans=1;
        for(int i=n-1;i>=0;i--){
            right[i]=ans;
            ans=ans*nums[i];
        }
     int output[]=new int[n];
        for(int i=0;i<n;i++){
            output[i]=left[i]*right[i];
        }
        return output;
    }
}