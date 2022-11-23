class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length;
     int total=0;
     total=n*(n+1)/2;
     for(int i=0;i<nums.length;i++){
       total-=nums[i];  
     }
        
      return total;
    }
}