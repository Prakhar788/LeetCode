class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ele=0;
       for(int i=0;i<nums.length;i++){
        if(c==0){
            ele=nums[i];
        }
        if(ele==nums[i]){
            c++;
        }
        else c--;
    }
        return ele;
 }    
}