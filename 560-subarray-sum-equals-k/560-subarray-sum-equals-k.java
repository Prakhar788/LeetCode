class Solution {
    public int subarraySum(int[] nums, int k) {
     int si=0,ei=0,count=0;
        while(si<nums.length){
            int sum=0;
         for(ei=si;ei<nums.length;ei++){
             sum+=nums[ei];
             if(sum==k){
                 count++;
             }
         }  
            si++;
        }
        return count;
    }
}