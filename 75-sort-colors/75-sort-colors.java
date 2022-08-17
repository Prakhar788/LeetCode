class Solution {
    public void sortColors(int[] nums) {
        //three pointer approach
        int temp;
        int m=0;
        int low=0;
        int high=nums.length-1;
        while(m<=high){
         if(nums[m]==0){
             temp=nums[m];
             nums[m]=nums[low];
             nums[low]=temp;
             m++;
             low++;
         } 
            else if(nums[m]==2){
             temp=nums[m];
             nums[m]=nums[high];
             nums[high]=temp;
             high--;
            }
            else
                m++;
        }
    }
}